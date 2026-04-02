package monopolydeal.model;

import java.util.Objects;

public abstract class Card {
    private final String id;

    protected Card() {
        this.id = UUID.randomUUID().toString();
    }

    protected Card(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public abstract String getDisplayName();

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Card card)) {
            return false;
        }
        return Objects.equals(id, card.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}


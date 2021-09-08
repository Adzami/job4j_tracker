package ru.job4j.stream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Card {
    private Suit suit;
    private Value value;

    public Card(Suit suit, Value value) {
        this.suit = suit;
        this.value = value;
    }

    @Override
    public String toString() {
        return "Card{"
                + "suit=" + suit
                + ", value=" + value
                + '}';
    }

    public static void main(String[] args) {
        List<Card> cards = Stream.of(Value.values())
                            .flatMap(value -> Stream.of(Suit.values())
                                                .map(suit -> new Card(suit, value)))
                            .collect(Collectors.toList());
        cards.stream().map(Object::toString).forEach(System.out::println);
    }
}

package ru.job4j.stream;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class ProfilesTest {
    @Test
    public void whenCollectAddresses() {
        List<Profile> profiles = List.of(
                new Profile(new Address("Moscow", "Krasnaya ploshad", 1, 1)),
                new Profile(new Address("St. Peterburg", "Dvorcovaya ploshad", 10, 10)),
                new Profile(new Address("Vladimir", "Lenina st.", 11, 11)),
                new Profile(new Address("Vladivostok", "Portovaya st.", 2, 2))
        );
        Profiles pr = new Profiles();
        List<Address> rsl = pr.collect(profiles);
        List<Address> expected = new ArrayList<>();
        expected.add(new Address("Moscow", "Krasnaya ploshad", 1, 1));
        expected.add(new Address("St. Peterburg", "Dvorcovaya ploshad", 10, 10));
        expected.add(new Address("Vladimir", "Lenina st.", 11, 11));
        expected.add(new Address("Vladivostok", "Portovaya st.", 2, 2));
        assertThat(rsl, is(expected));
    }
}
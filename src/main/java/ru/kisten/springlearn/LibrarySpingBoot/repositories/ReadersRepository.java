package ru.kisten.springlearn.LibrarySpingBoot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.kisten.springlearn.LibrarySpingBoot.models.Reader;

@Repository
public interface ReadersRepository extends JpaRepository<Reader, Integer> {
}

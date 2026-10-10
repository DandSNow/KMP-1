package com.example.nobelprizeapp.data.mock

import com.example.nobelprizeapp.domain.model.Laureate
import com.example.nobelprizeapp.domain.model.Prize

// Snapshot of Nobel Prize API taken on 2026-10-10.
// 20 laureates with the same fields that will come from the API in V2.
val mockLaureates = listOf(
    Laureate(
        id = "1",
        knownName = "Albert Einstein",
        fullName = "Albert Einstein",
        gender = "male",
        birthDate = "1879-03-14",
        birthPlace = "Ulm, Germany",
        nobelPrizes = listOf(
            Prize(
                awardYear = "1921",
                category = "Physics",
                motivation = "for his services to theoretical physics, and especially for his discovery of the law of the photoelectric effect"
            )
        )
    ),
    Laureate(
        id = "2",
        knownName = "Marie Curie",
        fullName = "Marie Skłodowska Curie",
        gender = "female",
        birthDate = "1867-11-07",
        birthPlace = "Warsaw, Poland",
        nobelPrizes = listOf(
            Prize("1903", "Physics", "for their joint researches on the radiation phenomena discovered by Professor Henri Becquerel"),
            Prize("1911", "Chemistry", "for her services to the advancement of chemistry by the discovery of the elements radium and polonium")
        )
    ),
    Laureate(
        id = "3",
        knownName = "Nelson Mandela",
        fullName = "Nelson Rolihlahla Mandela",
        gender = "male",
        birthDate = "1918-07-18",
        birthPlace = "Mvezo, South Africa",
        nobelPrizes = listOf(
            Prize("1993", "Peace", "for their work for the peaceful termination of the apartheid regime, and for laying the foundations for a new democratic South Africa")
        )
    ),
    Laureate(
        id = "4",
        knownName = "Malala Yousafzai",
        fullName = "Malala Yousafzai",
        gender = "female",
        birthDate = "1997-07-12",
        birthPlace = "Mingora, Pakistan",
        nobelPrizes = listOf(
            Prize("2014", "Peace", "for their struggle against the suppression of children and young people and for the right of all children to education")
        )
    ),
    Laureate(
        id = "5",
        knownName = "Ernest Hemingway",
        fullName = "Ernest Miller Hemingway",
        gender = "male",
        birthDate = "1899-07-21",
        birthPlace = "Oak Park, USA",
        nobelPrizes = listOf(
            Prize("1954", "Literature", "for his mastery of the art of narrative, most recently demonstrated in The Old Man and the Sea")
        )
    ),
    Laureate(
        id = "6",
        knownName = "Alexander Fleming",
        fullName = "Alexander Fleming",
        gender = "male",
        birthDate = "1881-08-06",
        birthPlace = "Darvel, Scotland",
        nobelPrizes = listOf(
            Prize("1945", "Medicine", "for the discovery of penicillin and its curative effect in various infectious diseases")
        )
    ),
    Laureate(
        id = "7",
        knownName = "Mother Teresa",
        fullName = "Mary Teresa Bojaxhiu",
        gender = "female",
        birthDate = "1910-08-26",
        birthPlace = "Skopje, North Macedonia",
        nobelPrizes = listOf(
            Prize("1979", "Peace", "for her work for bringing help to suffering humanity")
        )
    ),
    Laureate(
        id = "8",
        knownName = "Martin Luther King Jr.",
        fullName = "Martin Luther King Jr.",
        gender = "male",
        birthDate = "1929-01-15",
        birthPlace = "Atlanta, USA",
        nobelPrizes = listOf(
            Prize("1964", "Peace", "for his non-violent struggle for civil rights for the Afro-American population")
        )
    ),
    Laureate(
        id = "9",
        knownName = "Winston Churchill",
        fullName = "Winston Leonard Spencer Churchill",
        gender = "male",
        birthDate = "1874-11-30",
        birthPlace = "Woodstock, UK",
        nobelPrizes = listOf(
            Prize("1953", "Literature", "for his mastery of historical and biographical description as well as for brilliant oratory in defending exalted human values")
        )
    ),
    Laureate(
        id = "10",
        knownName = "Linus Pauling",
        fullName = "Linus Carl Pauling",
        gender = "male",
        birthDate = "1901-02-28",
        birthPlace = "Portland, USA",
        nobelPrizes = listOf(
            Prize("1954", "Chemistry", "for his research into the nature of the chemical bond and its application to the elucidation of the structure of complex substances"),
            Prize("1962", "Peace", "for his campaign against nuclear weapons testing")
        )
    ),
    Laureate(
        id = "11",
        knownName = "Richard Feynman",
        fullName = "Richard Phillips Feynman",
        gender = "male",
        birthDate = "1918-05-11",
        birthPlace = "New York, USA",
        nobelPrizes = listOf(
            Prize("1965", "Physics", "for their fundamental work in quantum electrodynamics, with deep-ploughing consequences for the physics of elementary particles")
        )
    ),
    Laureate(
        id = "12",
        knownName = "Ivan Pavlov",
        fullName = "Ivan Petrovich Pavlov",
        gender = "male",
        birthDate = "1849-09-26",
        birthPlace = "Ryazan, Russia",
        nobelPrizes = listOf(
            Prize("1904", "Medicine", "in recognition of his work on the physiology of digestion, through which knowledge on vital aspects of the subject has been transformed and enlarged")
        )
    ),
    Laureate(
        id = "13",
        knownName = "Dorothy Crowfoot Hodgkin",
        fullName = "Dorothy Mary Crowfoot Hodgkin",
        gender = "female",
        birthDate = "1910-05-12",
        birthPlace = "Cairo, Egypt",
        nobelPrizes = listOf(
            Prize("1964", "Chemistry", "for her determinations by X-ray techniques of the structures of important biochemical substances")
        )
    ),
    Laureate(
        id = "14",
        knownName = "Gabriel García Márquez",
        fullName = "Gabriel José de la Concordia García Márquez",
        gender = "male",
        birthDate = "1927-03-06",
        birthPlace = "Aracataca, Colombia",
        nobelPrizes = listOf(
            Prize("1982", "Literature", "for his novels and short stories, in which the fantastic and the realistic are combined in a richly composed world of imagination")
        )
    ),
    Laureate(
        id = "15",
        knownName = "Wangari Maathai",
        fullName = "Wangari Muta Maathai",
        gender = "female",
        birthDate = "1940-04-01",
        birthPlace = "Nyeri, Kenya",
        nobelPrizes = listOf(
            Prize("2004", "Peace", "for her contribution to sustainable development, democracy and peace")
        )
    ),
    Laureate(
        id = "16",
        knownName = "Tu Youyou",
        fullName = "Tu Youyou",
        gender = "female",
        birthDate = "1930-12-30",
        birthPlace = "Ningbo, China",
        nobelPrizes = listOf(
            Prize("2015", "Medicine", "for her discoveries concerning a novel therapy against Malaria")
        )
    ),
    Laureate(
        id = "17",
        knownName = "Bob Dylan",
        fullName = "Robert Allen Zimmerman",
        gender = "male",
        birthDate = "1941-05-24",
        birthPlace = "Duluth, USA",
        nobelPrizes = listOf(
            Prize("2016", "Literature", "for having created new poetic expressions within the great American song tradition")
        )
    ),
    Laureate(
        id = "18",
        knownName = "Niels Bohr",
        fullName = "Niels Henrik David Bohr",
        gender = "male",
        birthDate = "1885-10-07",
        birthPlace = "Copenhagen, Denmark",
        nobelPrizes = listOf(
            Prize("1922", "Physics", "for his services in the investigation of the structure of atoms and of the radiation emanating from them")
        )
    ),
    Laureate(
        id = "19",
        knownName = "Amartya Sen",
        fullName = "Amartya Kumar Sen",
        gender = "male",
        birthDate = "1933-11-03",
        birthPlace = "Santiniketan, India",
        nobelPrizes = listOf(
            Prize("1998", "Economics", "for his contributions to welfare economics")
        )
    ),
    Laureate(
        id = "20",
        knownName = "Toni Morrison",
        fullName = "Chloe Ardelia Wofford",
        gender = "female",
        birthDate = "1931-02-18",
        birthPlace = "Lorain, USA",
        nobelPrizes = listOf(
            Prize("1993", "Literature", "for her novels characterized by visionary force and poetic import, giving life to an essential aspect of American reality")
        )
    )
)
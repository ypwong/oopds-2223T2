// Exercise 3: Relationship between Objects of Same Class

// The UML Class Diagram for a Person class is provided below.
// Person
// - name: String
// - spouse: Person
// + Person (name: String)
// + setName (name: String): void
// + setSpouse (spouse: Person): void
// + toString(): String

// Define the Person class:
// • Note that a person may have another person as spouse. If the person does not have a spouse, the
// value of spouse data field is null.
// • The toString() method returns both the names of the person and the spouse. You shall check
// whether the person has a spouse. If the person does not have a spouse, then returns “none” as
// the spouse’s name.

// Write a test program that:
// 1. Create 2 persons. Give each of them a name. Display the name and spouse of each person.
// 2. Set the spouse of person to the other person. Display the name and spouse of each person.
// 3. Change the name of one of the 2 persons. Display the name and spouse of each person.

// Sample run:
// Name = Ali, spouse = none
// Name = Siti, spouse = none
// Ali and Siti get married.
// Name = Ali, spouse = Siti
// Name = Siti, spouse = Ali
// Change Ali's name to Abu.
// Name = Abu, spouse = Siti
// Name = Siti, spouse = Abu
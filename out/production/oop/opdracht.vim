
Practicum: Klassen maken
In (wetenschappelijke) publicaties wordt verwezen naar bronnen. Een bron kan zowel een boek als een artikel zijn.
Een boek heeft oa. een titel, auteur, jaartal en editie.
Een artikel heeft oa. een titel, auteur en jaartal.
Er zijn meer properties dan deze maar die worden buiten beschouwing gelaten.
Er zijn meer soorten bronnen dan boeken en artikelen.
Een auteur heeft voorletters (initials) en een achternaam (lastname).
1. Maak de klassen Source (parent class van Book en Article), Book, Article en Author. Voorkom zoveel mogelijk duplicate code.
Testdata:
Artikel: "Bringing Java to the enterprise: Oracle on its Java server strategy", 1998, auteur D. Rosenberg
Artikel: "Context-sensitive trace inlining for ", 2013, Christian Häubl, Christian Wimmer en Hanspeter Mössenböck
Artikel: "ARJA: Automated Repair of Java Programs via Multi-Objective Genetic Programming", 2020, Yuan Yuan en Wolfgang Banzhaf
Boek: "Head First Design Patterns", "Eric Freeman & Elisabeth Robson", 2020, 2e editie
2. Schrijf zinvolle implementaties van toString() waarbij optimaal gebruik wordt gemaakt van overerving.
Suggestie:
Author: <ACHTERNAAN>, <VOORLETTERS>
Book: [Book] <AUTEUR> - <TITEL>, <nr>. ed.
Article: [Article] <AUTEUR> - <TITEL>
3. Zorg voor ondersteuning voor meerdere auteurs bij een bron. Kies een geschikt datatype en pas de klassen aan.
Bespreek met de klas hoe dit aan te pakken.. Array? ArrayList? Hoe aanpakken met constructor, getters en setters?
Suggestie: Auteur uit constructor, ArrayList<Auteur> gebruiken, methodes addAuthor, getAuthor(int i) en getNumberOfAuthors maken.Elisabeth.
4. APA7 is een standaard om bronnen te vermelden.
Een wijze van APA7-bronvermelding is de auteurs en het jaartal van de bron noemen na citeren, bijvoorbeeld: "Automated program repair has recently stirred great interest in the software engineering community since it tries to address a very practical and important problem (Yuan & Benzhaf, 2020)."
Daarbij gelden de volgende regels: De achternamen van auteurs gevolgd door komma, spatie en jaartal worden tussen haakjes gezet. In geval van één auteur alleen achternaam, in geval van twee auteurs de achternamen gescheiden door een &-teken. In geval van 3 auteurs of meer, de achternaam van de eerste auteur gevolgd door "et al.", bijvoorbeeld "(Häubl et al., 2013)".
Schrijf de methode String generateAPA7parenthetical() om de bronvermelding te genereren.
5. Maak bronnen (klassen Book en Article) immutable.

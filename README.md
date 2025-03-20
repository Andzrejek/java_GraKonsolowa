# Konsolowa Gra RPG w Javie

## Opis gry

Gra jest prostą konsolową grą RPG, w której gracz może kontrolować dwie postacie: **Wojownika** i **Łowcę**. Każda postać ma unikalne umiejętności i statystyki:

- **Wojownik**: Ma większy zasięg ataku, ale zadaje mniejsze obrażenia.
- **Łowca**: Ma mniejszy zasięg ataku, ale zadaje większe obrażenia.

Postacie mogą wykonywać następujące akcje:
1. **Cios lekki** - zadaje przeciwnikowi niewielkie obrażenia.
2. **Cios mocny** - zadaje przeciwnikowi większe obrażenia, ale kosztuje więcej energii.
3. **Leczenie** - regeneruje część zdrowia postaci.
4. **Poruszanie** - postać może poruszać się po jednowymiarowej planszy (od pozycji 0 do 100).

Gra toczy się w konsoli, a gracz może wybierać akcje dla swoich postaci.

---

## Struktura projektu

Projekt składa się z następujących plików:

1. **`Postać.java`**: Klasa abstrakcyjna, która definiuje wspólne pola i metody dla wszystkich postaci.
2. **`Wojownik.java`**: Klasa reprezentująca postać Wojownika. Zawiera implementację metod z klasy `Postać`.
3. **`Łowca.java`**: Klasa reprezentująca postać Łowca. **Twoim zadaniem jest uzupełnienie tej klasy na podstawie klasy `Wojownik`**.
4. **`Main.java`**: Główna klasa programu, w której tworzone są obiekty postaci i wywoływane są ich metody.

---

## Zadanie do wykonania

### 1. Uzupełnij klasę `Łowca.java`

Klasa `Łowca` jest obecnie niekompletna. Przeczytaj komentarze ze wszystkich plików i uzupełnij gre ...
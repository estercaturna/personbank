package org.academiacodigo.thisfunctionals.exepersonbank;

public enum Payments {
    BILLS("Internet"),
    GAMES(""),
    FOOD("");

    private String strings;
        Payments(String names) {
            this.strings = names;
        }
        public String getNames() {
            return strings;
    }
}

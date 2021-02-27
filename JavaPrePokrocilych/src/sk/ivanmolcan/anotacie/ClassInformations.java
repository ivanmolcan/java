package sk.ivanmolcan.anotacie;

public @interface ClassInformations {
    String author();
    String date();
    int currentVersion();
    String lastModified();
    String lastModifiedBy();
    String[] reviewers();
}

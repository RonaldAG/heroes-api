package br.com.heroapi.urls;

public enum ApiUrl {
    DISNEY_GET_ALL_CHARACTERS("https://api.disneyapi.dev/character"),
    DISNEY_GET_CHARACTER_BY_ID("https://api.disneyapi.dev/character/");

    private final String link;

    ApiUrl(String x){
        this.link = x;
    }

    public String getLink(){
        return this.link;
    }
}

package EBACsrc.Modulo01.Test;

import EBACsrc.Modulo01.Domain.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime();
        anime.setNome("One Piece");
        anime.setEpisodeos(1200);
        anime.setGenero("Ação e aventura");

        anime.imprimeAnime();
    }
}

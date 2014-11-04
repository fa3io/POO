package aula4.cdvideo;

import java.util.ArrayList;
import java.util.List;

public class BaseDados {

    List<Cd> cdteca = new ArrayList<>();
    List<Video> videoteca = new ArrayList<>();

    public void apagaCd(int idCd) {
        cdteca.remove(idCd);
    }

    public void apagaVideo(int idVideo) {
        videoteca.remove(idVideo);
    }

    public void atualizaCd(int idCd, Cd cd) {
        cdteca.remove(idCd);
        cdteca.add(idCd, cd);
    }

    public void atualizaVideo(int idVideo, Video video) {
        videoteca.remove(idVideo);
        videoteca.add(idVideo, video);
    }

    public List<Cd> getListaCds() {
        return cdteca;
    }

    public List<Video> getListaVideos() {
        return videoteca;
    }

    public void inserirCd(Cd cd) {
        cdteca.add(cd);
    }

    public void inserirVideo(Video video) {
        videoteca.add(video);
    }

    public void listarCds() {
        System.out.println(cdteca.toString());
    }

    public void listarVideos() {
        System.out.println(videoteca.toString());
    }

    public void setListaCds(List<Cd> Cdteca) {
        this.cdteca = Cdteca;
    }

    public void setListaVideo(List<Video> Videoteca) {
        this.videoteca = Videoteca;
    }

}

package br.com.k19.android.cap05_02;

/**
 * Created by Edi Carlos on 04/03/2017.
 */

public class Note {

    private long id;
    private String note;

    @Override
    public String toString() {
        return note;
    }

    public long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

}



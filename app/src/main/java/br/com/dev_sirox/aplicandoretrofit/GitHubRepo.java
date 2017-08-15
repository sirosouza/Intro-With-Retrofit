package br.com.dev_sirox.aplicandoretrofit;

/**
 * Created by sirox90 on 14/08/2017.
 */

public class GitHubRepo {
    private int id;
    private String name;

    public GitHubRepo() {
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "id: " + id + "\nname: " + name;
    }
}

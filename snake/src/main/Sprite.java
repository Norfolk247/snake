package main;
import org.newdawn.slick.opengl.Texture;
import org.newdawn.slick.opengl.TextureLoader;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public enum Sprite {
    BODY("body"), FOOD("food"), WALL("wall");

    private Texture texture;

    private Sprite(String texturename){
        try {
            this.texture = TextureLoader.getTexture("PNG", new FileInputStream(new File("F:/Users/User/snake/pics/"+texturename+".png")));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public Texture getTexture(){
        return this.texture;
    }
}
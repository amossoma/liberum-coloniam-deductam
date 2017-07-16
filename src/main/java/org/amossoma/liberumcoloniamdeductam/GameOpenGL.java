package org.amossoma.liberumcoloniamdeductam;

import static org.lwjgl.glfw.GLFW.*; // allows us to create windows
import static org.lwjgl.opengl.GL11.*; // gives us access to things like "GL_TRUE" which we'll need
import static org.lwjgl.system.MemoryUtil.*; // allows us to use 'NULL' in our code, note this is slightly different from java's 'null'

import org.lwjgl.glfw.GLFWVidMode;
public class GameOpenGL implements Runnable{

    private Thread thread;
    public boolean running = true;

    public static void main(String args[]){
        GameOpenGL game = new GameOpenGL();
        game.start();
    }

    public void start(){
        running = true;
        thread = new Thread(this, "EndlessRunner");
        thread.start();
    }

    private long window;

    public void init(){
        if(!glfwInit()){
            System.err.println("GLFW initialization failed!");
        }

        glfwWindowHint(GLFW_RESIZABLE, GL_TRUE);

        window = glfwCreateWindow(800, 600, "Endless Runner", NULL, NULL);

        if(window == NULL){
            System.err.println("Could not create our Window!");
        }

        GLFWVidMode vidmode = glfwGetVideoMode(glfwGetPrimaryMonitor());
        glfwSetWindowPos(window, 100, 100);
        glfwMakeContextCurrent(window);
        glfwShowWindow(window);
    }


    @Override
    public void run() {
        init();
        while(running){
            update();
            render();
            running = !glfwWindowShouldClose(window);
        }
    }

    public void update(){
        glfwPollEvents();
    }

    public void render(){
        glfwSwapBuffers(window);
    }
}


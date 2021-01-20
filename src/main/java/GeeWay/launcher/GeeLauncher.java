package GeeWay.launcher;

import io.vertx.core.Launcher;

public class GeeLauncher extends Launcher {
    public static void main(String[] args) {
        new GeeLauncher().dispatch(args);
    }
}

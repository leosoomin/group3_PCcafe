package login;

import java.nio.file.Paths;

public interface LoginURL {
	public String fxpath = "file:/"+Paths.get("").toAbsolutePath().toString()+"/bin/";
}

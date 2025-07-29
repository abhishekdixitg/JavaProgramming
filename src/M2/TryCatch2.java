package M2;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;

public class TryCatch2 {
	public void read() throws IOException {
		BufferedInputStream in = new BufferedInputStream(new InputStream() {

			@Override
			public int read() throws IOException {
				// TODO Auto-generated method stub
				return 0;
			}
		});
	}
}

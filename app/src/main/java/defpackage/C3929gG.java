package defpackage;

import java.io.BufferedReader;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;

/* renamed from: gG, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3929gG implements Closeable {
    public final HttpURLConnection a;

    public C3929gG(HttpURLConnection httpURLConnection) {
        this.a = httpURLConnection;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.a.disconnect();
    }

    public final String m() throws IOException {
        HttpURLConnection httpURLConnection = this.a;
        boolean z = false;
        try {
            if (httpURLConnection.getResponseCode() / 100 == 2) {
                z = true;
            }
        } catch (IOException unused) {
        }
        if (z) {
            return null;
        }
        try {
            StringBuilder sb = new StringBuilder();
            sb.append("Unable to fetch ");
            sb.append(httpURLConnection.getURL());
            sb.append(". Failed with ");
            sb.append(httpURLConnection.getResponseCode());
            sb.append("\n");
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getErrorStream()));
            StringBuilder sb2 = new StringBuilder();
            while (true) {
                try {
                    String line = bufferedReader.readLine();
                    if (line != null) {
                        sb2.append(line);
                        sb2.append('\n');
                    } else {
                        try {
                            break;
                        } catch (Exception unused2) {
                        }
                    }
                } finally {
                    try {
                        bufferedReader.close();
                    } catch (Exception unused3) {
                    }
                }
            }
            sb.append(sb2.toString());
            return sb.toString();
        } catch (IOException e) {
            AbstractC7281tl0.c("get error failed ", e);
            return e.getMessage();
        }
    }
}

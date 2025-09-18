package defpackage;

import android.content.Context;
import android.os.Build;
import java.io.IOException;
import java.io.InputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.security.KeyManagementException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import org.apache.http.conn.ssl.BrowserCompatHostnameVerifier;
import org.apache.http.conn.ssl.StrictHostnameVerifier;

/* renamed from: mX0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5903mX0 extends SSLSocketFactory {
    public static volatile C5903mX0 d;
    public final SSLContext a;
    public Context b;
    public String[] c;

    static {
        new BrowserCompatHostnameVerifier();
        new StrictHostnameVerifier();
        d = null;
    }

    public C5903mX0(Context context) throws KeyManagementException {
        InputStream inputStreamI;
        this.a = null;
        if (context == null) {
            return;
        }
        this.b = context.getApplicationContext();
        this.a = Build.VERSION.SDK_INT >= 29 ? SSLContext.getInstance("TLSv1.3") : SSLContext.getInstance("TLSv1.2");
        System.currentTimeMillis();
        if (AbstractC3401dU1.a == null) {
            AbstractC3401dU1.a = context.getApplicationContext();
        }
        if (AbstractC7811wX0.a == null) {
            synchronized (AbstractC7811wX0.class) {
                if (AbstractC7811wX0.a == null) {
                    try {
                        inputStreamI = AbstractC6889ri.i(context);
                    } catch (RuntimeException unused) {
                        inputStreamI = null;
                    }
                    AbstractC7811wX0.a = new C8001xX0(inputStreamI == null ? context.getAssets().open("hmsrootcas.bks") : inputStreamI);
                }
            }
        }
        System.currentTimeMillis();
        this.a.init(null, new X509TrustManager[]{AbstractC7811wX0.a}, null);
    }

    public static C5903mX0 a(Context context) {
        System.currentTimeMillis();
        if (context != null && AbstractC3401dU1.a == null) {
            AbstractC3401dU1.a = context.getApplicationContext();
        }
        if (d == null) {
            synchronized (C5903mX0.class) {
                try {
                    if (d == null) {
                        d = new C5903mX0(context);
                    }
                } finally {
                }
            }
        }
        if (d.b == null && context != null) {
            C5903mX0 c5903mX0 = d;
            c5903mX0.getClass();
            c5903mX0.b = context.getApplicationContext();
        }
        System.currentTimeMillis();
        return d;
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(String str, int i) throws IOException {
        Socket socketCreateSocket = this.a.getSocketFactory().createSocket(str, i);
        if (socketCreateSocket instanceof SSLSocket) {
            SSLSocket sSLSocket = (SSLSocket) socketCreateSocket;
            GB1.c(sSLSocket);
            if (sSLSocket != null) {
                String[] strArr = GB1.a;
                String[] enabledCipherSuites = sSLSocket.getEnabledCipherSuites();
                ArrayList arrayList = new ArrayList();
                List listAsList = Arrays.asList(strArr);
                for (String str2 : enabledCipherSuites) {
                    if (listAsList.contains(str2.toUpperCase(Locale.ENGLISH))) {
                        arrayList.add(str2);
                    }
                }
                if (arrayList.isEmpty()) {
                    String[] strArr2 = GB1.b;
                    String[] enabledCipherSuites2 = sSLSocket.getEnabledCipherSuites();
                    ArrayList arrayList2 = new ArrayList();
                    for (String str3 : enabledCipherSuites2) {
                        String upperCase = str3.toUpperCase(Locale.ENGLISH);
                        int i2 = 0;
                        while (true) {
                            if (i2 >= 16) {
                                arrayList2.add(str3);
                                break;
                            }
                            if (upperCase.contains(strArr2[i2].toUpperCase(Locale.ENGLISH))) {
                                break;
                            }
                            i2++;
                        }
                    }
                    if (!arrayList2.isEmpty()) {
                        sSLSocket.setEnabledCipherSuites((String[]) arrayList2.toArray(new String[arrayList2.size()]));
                    }
                } else {
                    sSLSocket.setEnabledCipherSuites((String[]) arrayList.toArray(new String[arrayList.size()]));
                }
            }
            this.c = (String[]) ((SSLSocket) socketCreateSocket).getEnabledCipherSuites().clone();
        }
        return socketCreateSocket;
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final String[] getDefaultCipherSuites() {
        return new String[0];
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final String[] getSupportedCipherSuites() {
        String[] strArr = this.c;
        return strArr != null ? strArr : new String[0];
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(InetAddress inetAddress, int i) {
        return createSocket(inetAddress.getHostAddress(), i);
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(String str, int i, InetAddress inetAddress, int i2) {
        return createSocket(str, i);
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(InetAddress inetAddress, int i, InetAddress inetAddress2, int i2) {
        return createSocket(inetAddress.getHostAddress(), i);
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final Socket createSocket(Socket socket, String str, int i, boolean z) throws IOException {
        Socket socketCreateSocket = this.a.getSocketFactory().createSocket(socket, str, i, z);
        if (socketCreateSocket instanceof SSLSocket) {
            SSLSocket sSLSocket = (SSLSocket) socketCreateSocket;
            GB1.c(sSLSocket);
            if (sSLSocket != null) {
                String[] strArr = GB1.a;
                String[] enabledCipherSuites = sSLSocket.getEnabledCipherSuites();
                ArrayList arrayList = new ArrayList();
                List listAsList = Arrays.asList(strArr);
                for (String str2 : enabledCipherSuites) {
                    if (listAsList.contains(str2.toUpperCase(Locale.ENGLISH))) {
                        arrayList.add(str2);
                    }
                }
                if (!arrayList.isEmpty()) {
                    sSLSocket.setEnabledCipherSuites((String[]) arrayList.toArray(new String[arrayList.size()]));
                } else {
                    String[] strArr2 = GB1.b;
                    String[] enabledCipherSuites2 = sSLSocket.getEnabledCipherSuites();
                    ArrayList arrayList2 = new ArrayList();
                    for (String str3 : enabledCipherSuites2) {
                        String upperCase = str3.toUpperCase(Locale.ENGLISH);
                        int i2 = 0;
                        while (true) {
                            if (i2 < 16) {
                                if (upperCase.contains(strArr2[i2].toUpperCase(Locale.ENGLISH))) {
                                    break;
                                }
                                i2++;
                            } else {
                                arrayList2.add(str3);
                                break;
                            }
                        }
                    }
                    if (!arrayList2.isEmpty()) {
                        sSLSocket.setEnabledCipherSuites((String[]) arrayList2.toArray(new String[arrayList2.size()]));
                    }
                }
            }
            this.c = (String[]) ((SSLSocket) socketCreateSocket).getEnabledCipherSuites().clone();
        }
        return socketCreateSocket;
    }
}

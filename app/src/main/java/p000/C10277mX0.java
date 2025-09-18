package p000;

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
public final class C10277mX0 extends SSLSocketFactory {

    /* renamed from: d */
    public static volatile C10277mX0 f37759d;

    /* renamed from: a */
    public final SSLContext f37760a;

    /* renamed from: b */
    public Context f37761b;

    /* renamed from: c */
    public String[] f37762c;

    static {
        new BrowserCompatHostnameVerifier();
        new StrictHostnameVerifier();
        f37759d = null;
    }

    public C10277mX0(Context context) throws KeyManagementException {
        InputStream inputStreamM24462i;
        this.f37760a = null;
        if (context == null) {
            return;
        }
        this.f37761b = context.getApplicationContext();
        this.f37760a = Build.VERSION.SDK_INT >= 29 ? SSLContext.getInstance("TLSv1.3") : SSLContext.getInstance("TLSv1.2");
        System.currentTimeMillis();
        if (AbstractC9120dU1.f26123a == null) {
            AbstractC9120dU1.f26123a = context.getApplicationContext();
        }
        if (AbstractC11556wX0.f44937a == null) {
            synchronized (AbstractC11556wX0.class) {
                if (AbstractC11556wX0.f44937a == null) {
                    try {
                        inputStreamM24462i = AbstractC6760ri.m24462i(context);
                    } catch (RuntimeException unused) {
                        inputStreamM24462i = null;
                    }
                    AbstractC11556wX0.f44937a = new C11683xX0(inputStreamM24462i == null ? context.getAssets().open("hmsrootcas.bks") : inputStreamM24462i);
                }
            }
        }
        System.currentTimeMillis();
        this.f37760a.init(null, new X509TrustManager[]{AbstractC11556wX0.f44937a}, null);
    }

    /* renamed from: a */
    public static C10277mX0 m22836a(Context context) {
        System.currentTimeMillis();
        if (context != null && AbstractC9120dU1.f26123a == null) {
            AbstractC9120dU1.f26123a = context.getApplicationContext();
        }
        if (f37759d == null) {
            synchronized (C10277mX0.class) {
                try {
                    if (f37759d == null) {
                        f37759d = new C10277mX0(context);
                    }
                } finally {
                }
            }
        }
        if (f37759d.f37761b == null && context != null) {
            C10277mX0 c10277mX0 = f37759d;
            c10277mX0.getClass();
            c10277mX0.f37761b = context.getApplicationContext();
        }
        System.currentTimeMillis();
        return f37759d;
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(String str, int i) throws IOException {
        Socket socketCreateSocket = this.f37760a.getSocketFactory().createSocket(str, i);
        if (socketCreateSocket instanceof SSLSocket) {
            SSLSocket sSLSocket = (SSLSocket) socketCreateSocket;
            GB1.m2969c(sSLSocket);
            if (sSLSocket != null) {
                String[] strArr = GB1.f3632a;
                String[] enabledCipherSuites = sSLSocket.getEnabledCipherSuites();
                ArrayList arrayList = new ArrayList();
                List listAsList = Arrays.asList(strArr);
                for (String str2 : enabledCipherSuites) {
                    if (listAsList.contains(str2.toUpperCase(Locale.ENGLISH))) {
                        arrayList.add(str2);
                    }
                }
                if (arrayList.isEmpty()) {
                    String[] strArr2 = GB1.f3633b;
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
            this.f37762c = (String[]) ((SSLSocket) socketCreateSocket).getEnabledCipherSuites().clone();
        }
        return socketCreateSocket;
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final String[] getDefaultCipherSuites() {
        return new String[0];
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final String[] getSupportedCipherSuites() {
        String[] strArr = this.f37762c;
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
        Socket socketCreateSocket = this.f37760a.getSocketFactory().createSocket(socket, str, i, z);
        if (socketCreateSocket instanceof SSLSocket) {
            SSLSocket sSLSocket = (SSLSocket) socketCreateSocket;
            GB1.m2969c(sSLSocket);
            if (sSLSocket != null) {
                String[] strArr = GB1.f3632a;
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
                    String[] strArr2 = GB1.f3633b;
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
            this.f37762c = (String[]) ((SSLSocket) socketCreateSocket).getEnabledCipherSuites().clone();
        }
        return socketCreateSocket;
    }
}

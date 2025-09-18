package com.yandex.metrica.impl.p022ob;

import com.yandex.metrica.impl.p022ob.InterfaceC3264fi;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.security.KeyManagementException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.UnrecoverableKeyException;
import java.security.cert.CertificateException;
import javax.net.ssl.KeyManagerFactory;
import javax.net.ssl.SSLContext;

/* renamed from: com.yandex.metrica.impl.ob.Vh */
/* loaded from: classes2.dex */
class C3008Vh implements InterfaceC3264fi {

    /* renamed from: a */
    private final File f22620a;

    public C3008Vh(File file) {
        this.f22620a = file;
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC3264fi
    /* renamed from: a */
    public ServerSocket mo15022a(int i) throws NoSuchAlgorithmException, UnrecoverableKeyException, IOException, KeyStoreException, CertificateException, KeyManagementException, InterfaceC3264fi.a {
        try {
            SSLContext sSLContext = SSLContext.getInstance("TLS");
            KeyManagerFactory keyManagerFactory = KeyManagerFactory.getInstance(KeyManagerFactory.getDefaultAlgorithm());
            KeyStore keyStore = KeyStore.getInstance("PKCS12");
            keyStore.load(new FileInputStream(this.f22620a), "`0l}%01ny{jl~;|&".toCharArray());
            keyManagerFactory.init(keyStore, "`0l}%01ny{jl~;|&".toCharArray());
            sSLContext.init(keyManagerFactory.getKeyManagers(), null, null);
            return sSLContext.getServerSocketFactory().createServerSocket(i);
        } catch (Exception e) {
            throw new InterfaceC3264fi.a("https_open_error", e);
        }
    }
}

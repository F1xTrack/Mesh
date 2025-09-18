package com.yandex.metrica.impl.ob;

import com.yandex.metrica.impl.ob.InterfaceC2758fi;
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

/* loaded from: classes2.dex */
class Vh implements InterfaceC2758fi {
    private final File a;

    public Vh(File file) {
        this.a = file;
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC2758fi
    public ServerSocket a(int i) throws NoSuchAlgorithmException, UnrecoverableKeyException, IOException, KeyStoreException, CertificateException, KeyManagementException, InterfaceC2758fi.a {
        try {
            SSLContext sSLContext = SSLContext.getInstance("TLS");
            KeyManagerFactory keyManagerFactory = KeyManagerFactory.getInstance(KeyManagerFactory.getDefaultAlgorithm());
            KeyStore keyStore = KeyStore.getInstance("PKCS12");
            keyStore.load(new FileInputStream(this.a), "`0l}%01ny{jl~;|&".toCharArray());
            keyManagerFactory.init(keyStore, "`0l}%01ny{jl~;|&".toCharArray());
            sSLContext.init(keyManagerFactory.getKeyManagers(), null, null);
            return sSLContext.getServerSocketFactory().createServerSocket(i);
        } catch (Exception e) {
            throw new InterfaceC2758fi.a("https_open_error", e);
        }
    }
}

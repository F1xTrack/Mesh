package p000;

import android.net.Uri;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MulticastSocket;
import java.net.SocketTimeoutException;

/* renamed from: Ef1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7533Ef1 extends AbstractC1426Wf {

    /* renamed from: e */
    public final int f2826e;

    /* renamed from: f */
    public final byte[] f2827f;

    /* renamed from: g */
    public final DatagramPacket f2828g;

    /* renamed from: h */
    public Uri f2829h;

    /* renamed from: i */
    public DatagramSocket f2830i;

    /* renamed from: j */
    public MulticastSocket f2831j;

    /* renamed from: k */
    public InetAddress f2832k;

    /* renamed from: l */
    public boolean f2833l;

    /* renamed from: m */
    public int f2834m;

    public C7533Ef1() {
        super(true);
        this.f2826e = JosStatusCodes.RTN_CODE_COMMON_ERROR;
        byte[] bArr = new byte[2000];
        this.f2827f = bArr;
        this.f2828g = new DatagramPacket(bArr, 0, 2000);
    }

    @Override // p000.InterfaceC1586ZC
    /* renamed from: c */
    public final long mo2365c(C3976eD c3976eD) throws IOException {
        Uri uri = c3976eD.f26595a;
        this.f2829h = uri;
        String host = uri.getHost();
        host.getClass();
        int port = this.f2829h.getPort();
        m8827g();
        try {
            this.f2832k = InetAddress.getByName(host);
            InetSocketAddress inetSocketAddress = new InetSocketAddress(this.f2832k, port);
            if (this.f2832k.isMulticastAddress()) {
                MulticastSocket multicastSocket = new MulticastSocket(inetSocketAddress);
                this.f2831j = multicastSocket;
                multicastSocket.joinGroup(this.f2832k);
                this.f2830i = this.f2831j;
            } else {
                this.f2830i = new DatagramSocket(inetSocketAddress);
            }
            this.f2830i.setSoTimeout(this.f2826e);
            this.f2833l = true;
            m8828h(c3976eD);
            return -1L;
        } catch (IOException e) {
            throw new C7481Df1(2001, e);
        } catch (SecurityException e2) {
            throw new C7481Df1(2006, e2);
        }
    }

    @Override // p000.InterfaceC1586ZC
    public final void close() throws IOException {
        this.f2829h = null;
        MulticastSocket multicastSocket = this.f2831j;
        if (multicastSocket != null) {
            try {
                InetAddress inetAddress = this.f2832k;
                inetAddress.getClass();
                multicastSocket.leaveGroup(inetAddress);
            } catch (IOException unused) {
            }
            this.f2831j = null;
        }
        DatagramSocket datagramSocket = this.f2830i;
        if (datagramSocket != null) {
            datagramSocket.close();
            this.f2830i = null;
        }
        this.f2832k = null;
        this.f2834m = 0;
        if (this.f2833l) {
            this.f2833l = false;
            m8826e();
        }
    }

    @Override // p000.InterfaceC1586ZC
    /* renamed from: o */
    public final Uri mo2366o() {
        return this.f2829h;
    }

    @Override // p000.InterfaceC1082RC
    /* renamed from: r */
    public final int mo2367r(byte[] bArr, int i, int i2) throws IOException {
        if (i2 == 0) {
            return 0;
        }
        int i3 = this.f2834m;
        DatagramPacket datagramPacket = this.f2828g;
        if (i3 == 0) {
            try {
                DatagramSocket datagramSocket = this.f2830i;
                datagramSocket.getClass();
                datagramSocket.receive(datagramPacket);
                int length = datagramPacket.getLength();
                this.f2834m = length;
                m8825a(length);
            } catch (SocketTimeoutException e) {
                throw new C7481Df1(2002, e);
            } catch (IOException e2) {
                throw new C7481Df1(2001, e2);
            }
        }
        int length2 = datagramPacket.getLength();
        int i4 = this.f2834m;
        int iMin = Math.min(i4, i2);
        System.arraycopy(this.f2827f, length2 - i4, bArr, i, iMin);
        this.f2834m -= iMin;
        return iMin;
    }
}

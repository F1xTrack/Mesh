package p000;

import android.hardware.camera2.CaptureRequest;
import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: in */
/* loaded from: classes.dex */
public final class C4264in {

    /* renamed from: a */
    public int f29447a;

    /* renamed from: b */
    public int f29448b;

    /* renamed from: c */
    public final HashMap f29449c;

    /* renamed from: d */
    public final ArrayList f29450d;

    public C4264in(int i) {
        switch (i) {
            case 2:
                this.f29450d = new ArrayList();
                this.f29449c = new HashMap();
                this.f29447a = 1;
                break;
            default:
                this.f29447a = 1;
                this.f29448b = 0;
                this.f29449c = new HashMap();
                this.f29450d = new ArrayList();
                break;
        }
    }

    /* renamed from: a */
    public void m19091a(InterfaceC4012en interfaceC4012en) {
        this.f29450d.add(interfaceC4012en);
    }

    /* renamed from: b */
    public void m19092b(CaptureRequest.Key key, Object obj) {
        this.f29449c.put(key, obj);
    }

    /* renamed from: c */
    public void m19093c(int i) {
        this.f29450d.add(Integer.valueOf(i));
    }

    /* renamed from: d */
    public C4264in m19094d() {
        return new C4264in(this.f29447a, this.f29448b, this.f29450d, this.f29449c);
    }

    /* renamed from: e */
    public C11544wR0 m19095e() {
        return new C11544wR0(this.f29447a, this.f29448b, this.f29450d, this.f29449c);
    }

    /* renamed from: f */
    public void m19096f(int i) {
        this.f29448b = i;
    }

    /* renamed from: g */
    public void m19097g(CaptureRequest.Key key, Object obj) {
        this.f29449c.put(key, obj);
    }

    /* renamed from: h */
    public void m19098h(int i) {
        this.f29447a = i;
    }

    /* renamed from: i */
    public void m19099i(int i) {
        this.f29448b = i;
    }

    /* renamed from: j */
    public void m19100j(int i) {
        this.f29447a = i;
    }

    public C4264in(int i, int i2, ArrayList arrayList, HashMap map) {
        this.f29447a = i;
        this.f29448b = i2;
        this.f29449c = map;
        this.f29450d = arrayList;
    }
}

package defpackage;

import android.hardware.camera2.CaptureRequest;
import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: in, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4409in {
    public int a;
    public int b;
    public final HashMap c;
    public final ArrayList d;

    public C4409in(int i) {
        switch (i) {
            case 2:
                this.d = new ArrayList();
                this.c = new HashMap();
                this.a = 1;
                break;
            default:
                this.a = 1;
                this.b = 0;
                this.c = new HashMap();
                this.d = new ArrayList();
                break;
        }
    }

    public void a(InterfaceC3646en interfaceC3646en) {
        this.d.add(interfaceC3646en);
    }

    public void b(CaptureRequest.Key key, Object obj) {
        this.c.put(key, obj);
    }

    public void c(int i) {
        this.d.add(Integer.valueOf(i));
    }

    public C4409in d() {
        return new C4409in(this.a, this.b, this.d, this.c);
    }

    public C7793wR0 e() {
        return new C7793wR0(this.a, this.b, this.d, this.c);
    }

    public void f(int i) {
        this.b = i;
    }

    public void g(CaptureRequest.Key key, Object obj) {
        this.c.put(key, obj);
    }

    public void h(int i) {
        this.a = i;
    }

    public void i(int i) {
        this.b = i;
    }

    public void j(int i) {
        this.a = i;
    }

    public C4409in(int i, int i2, ArrayList arrayList, HashMap map) {
        this.a = i;
        this.b = i2;
        this.c = map;
        this.d = arrayList;
    }
}

package defpackage;

import android.media.Image;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: yX */
/* loaded from: classes.dex */
public abstract class AbstractC8190yX implements InterfaceC3903g70 {
    public final InterfaceC3903g70 b;
    public final Object a = new Object();
    public final HashSet c = new HashSet();

    public AbstractC8190yX(InterfaceC3903g70 interfaceC3903g70) {
        this.b = interfaceC3903g70;
    }

    @Override // defpackage.InterfaceC3903g70
    public K60 P() {
        return this.b.P();
    }

    @Override // defpackage.InterfaceC3903g70
    public final Image Z() {
        return this.b.Z();
    }

    public final void a(InterfaceC8000xX interfaceC8000xX) {
        synchronized (this.a) {
            this.c.add(interfaceC8000xX);
        }
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        HashSet hashSet;
        this.b.close();
        synchronized (this.a) {
            hashSet = new HashSet(this.c);
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((InterfaceC8000xX) it.next()).b(this);
        }
    }

    @Override // defpackage.InterfaceC3903g70
    public int getHeight() {
        return this.b.getHeight();
    }

    @Override // defpackage.InterfaceC3903g70
    public int getWidth() {
        return this.b.getWidth();
    }

    @Override // defpackage.InterfaceC3903g70
    public final int j0() {
        return this.b.j0();
    }

    @Override // defpackage.InterfaceC3903g70
    public final G10[] u() {
        return this.b.u();
    }
}

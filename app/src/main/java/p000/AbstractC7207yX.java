package p000;

import android.media.Image;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: yX */
/* loaded from: classes.dex */
public abstract class AbstractC7207yX implements InterfaceC9457g70 {

    /* renamed from: b */
    public final InterfaceC9457g70 f46285b;

    /* renamed from: a */
    public final Object f46284a = new Object();

    /* renamed from: c */
    public final HashSet f46286c = new HashSet();

    public AbstractC7207yX(InterfaceC9457g70 interfaceC9457g70) {
        this.f46285b = interfaceC9457g70;
    }

    @Override // p000.InterfaceC9457g70
    /* renamed from: P */
    public K60 mo18403P() {
        return this.f46285b.mo18403P();
    }

    @Override // p000.InterfaceC9457g70
    /* renamed from: Z */
    public final Image mo18404Z() {
        return this.f46285b.mo18404Z();
    }

    /* renamed from: a */
    public final void m26161a(InterfaceC7144xX interfaceC7144xX) {
        synchronized (this.f46284a) {
            this.f46286c.add(interfaceC7144xX);
        }
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        HashSet hashSet;
        this.f46285b.close();
        synchronized (this.f46284a) {
            hashSet = new HashSet(this.f46286c);
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((InterfaceC7144xX) it.next()).mo4038b(this);
        }
    }

    @Override // p000.InterfaceC9457g70
    public int getHeight() {
        return this.f46285b.getHeight();
    }

    @Override // p000.InterfaceC9457g70
    public int getWidth() {
        return this.f46285b.getWidth();
    }

    @Override // p000.InterfaceC9457g70
    /* renamed from: j0 */
    public final int mo18405j0() {
        return this.f46285b.mo18405j0();
    }

    @Override // p000.InterfaceC9457g70
    /* renamed from: u */
    public final G10[] mo18406u() {
        return this.f46285b.mo18406u();
    }
}

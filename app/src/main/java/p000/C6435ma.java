package p000;

import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: ma */
/* loaded from: classes.dex */
public final class C6435ma {

    /* renamed from: a */
    public boolean f37776a;

    /* renamed from: b */
    public boolean f37777b;

    /* renamed from: c */
    public boolean f37778c;

    public C6435ma(boolean z, boolean z2, boolean z3) {
        this.f37776a = z;
        this.f37777b = z2;
        this.f37778c = z3;
    }

    /* renamed from: a */
    public C6498na m22900a() {
        if (this.f37776a || !(this.f37777b || this.f37778c)) {
            return new C6498na(this);
        }
        throw new IllegalStateException("Secondary offload attribute fields are true but primary isFormatSupported is false");
    }

    /* renamed from: b */
    public boolean m22901b() {
        return (this.f37778c || this.f37777b) && this.f37776a;
    }

    /* renamed from: c */
    public void m22902c(ArrayList arrayList) {
        if ((this.f37776a || this.f37777b || this.f37778c) && arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((AbstractC4232iH) it.next()).mo6573a();
            }
            AbstractC7806Jm0.m4412f("ForceCloseDeferrableSurface");
        }
    }
}

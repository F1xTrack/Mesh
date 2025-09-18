package p000;

import androidx.fragment.app.Fragment;
import java.util.Iterator;

/* renamed from: io0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9799io0 {

    /* renamed from: a */
    public final /* synthetic */ int f34753a;

    /* renamed from: b */
    public final /* synthetic */ Fragment f34754b;

    public /* synthetic */ C9799io0(Fragment fragment, int i) {
        this.f34753a = i;
        this.f34754b = fragment;
    }

    /* renamed from: a */
    public final void m21929a() {
        switch (this.f34753a) {
            case 0:
                ((C9927jo0) this.f34754b).f35411z.setEnabled(false);
                break;
            default:
                Iterator it = ((C10567oo0) this.f34754b).f16856a.iterator();
                while (it.hasNext()) {
                    ((C9799io0) it.next()).m21929a();
                }
                break;
        }
    }

    /* renamed from: b */
    public final void m21930b(Long l) {
        switch (this.f34753a) {
            case 0:
                C9927jo0 c9927jo0 = (C9927jo0) this.f34754b;
                c9927jo0.m22107x(c9927jo0.m22105t());
                c9927jo0.f35411z.setEnabled(c9927jo0.m22104s().f27015a != null);
                break;
            default:
                Iterator it = ((C10567oo0) this.f34754b).f16856a.iterator();
                while (it.hasNext()) {
                    ((C9799io0) it.next()).m21930b(l);
                }
                break;
        }
    }
}

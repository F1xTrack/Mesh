package defpackage;

import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: classes.dex */
public final class YV1 {
    public final /* synthetic */ int a;
    public final AbstractSafeParcelable b;

    public /* synthetic */ YV1(AbstractSafeParcelable abstractSafeParcelable, int i) {
        this.a = i;
        this.b = abstractSafeParcelable;
    }

    public final int a() {
        switch (this.a) {
            case 0:
                return ((J32) this.b).a;
            default:
                return ((Y12) this.b).a;
        }
    }
}

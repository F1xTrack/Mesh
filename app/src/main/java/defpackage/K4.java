package defpackage;

import java.util.List;

/* loaded from: classes.dex */
public final class K4 extends U0 {
    public final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ K4(List list, int i) {
        super(2, list);
        this.c = i;
    }

    @Override // defpackage.R4
    public final AbstractC5738lg M0() {
        switch (this.c) {
            case 0:
                return new C0548Gu((List) this.b, 0);
            case 1:
                return new R10((List) this.b, 0);
            case 2:
                return new C0548Gu((List) this.b, 1);
            case 3:
                return new R10((List) this.b, 1);
            case 4:
                return new R10((List) this.b, 2);
            case 5:
                return new UZ0((List) this.b);
            default:
                return new C0548Gu((List) this.b, 2);
        }
    }
}

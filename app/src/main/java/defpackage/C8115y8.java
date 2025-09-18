package defpackage;

/* renamed from: y8 */
/* loaded from: classes2.dex */
public final class C8115y8 extends AbstractC5990n0 {
    public int c = -1;
    public final /* synthetic */ C8305z8 d;

    public C8115y8(C8305z8 c8305z8) {
        this.d = c8305z8;
    }

    @Override // defpackage.AbstractC5990n0
    public final void a() {
        int i;
        Object[] objArr;
        do {
            i = this.c + 1;
            this.c = i;
            objArr = this.d.a;
            if (i >= objArr.length) {
                break;
            }
        } while (objArr[i] == null);
        if (i >= objArr.length) {
            this.a = 2;
            return;
        }
        Object obj = objArr[i];
        O90.d(obj, "null cannot be cast to non-null type T of org.jetbrains.kotlin.util.ArrayMapImpl");
        this.b = obj;
        this.a = 1;
    }
}

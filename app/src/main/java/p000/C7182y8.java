package p000;

/* renamed from: y8 */
/* loaded from: classes2.dex */
public final class C7182y8 extends AbstractC6462n0 {

    /* renamed from: c */
    public int f46099c = -1;

    /* renamed from: d */
    public final /* synthetic */ C7245z8 f46100d;

    public C7182y8(C7245z8 c7245z8) {
        this.f46100d = c7245z8;
    }

    @Override // p000.AbstractC6462n0
    /* renamed from: a */
    public final void mo17689a() {
        int i;
        Object[] objArr;
        do {
            i = this.f46099c + 1;
            this.f46099c = i;
            objArr = this.f46100d.f46641a;
            if (i >= objArr.length) {
                break;
            }
        } while (objArr[i] == null);
        if (i >= objArr.length) {
            this.f38026a = 2;
            return;
        }
        Object obj = objArr[i];
        O90.m5966d(obj, "null cannot be cast to non-null type T of org.jetbrains.kotlin.util.ArrayMapImpl");
        this.f38027b = obj;
        this.f38026a = 1;
    }
}

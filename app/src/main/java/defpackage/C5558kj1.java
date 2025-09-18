package defpackage;

import com.facebook.react.bridge.WritableMap;
import java.util.ArrayList;

/* renamed from: kj1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5558kj1 extends AbstractC1676Vg0 implements InterfaceC6099nZ {
    public final /* synthetic */ int e;
    public final /* synthetic */ C7467uj1 f;
    public final /* synthetic */ ArrayList g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C5558kj1(C7467uj1 c7467uj1, ArrayList arrayList, int i) {
        super(1);
        this.e = i;
        this.f = c7467uj1;
        this.g = arrayList;
    }

    @Override // defpackage.InterfaceC6099nZ
    public final Object invoke(Object obj) {
        switch (this.e) {
            case 0:
                WritableMap writableMap = (WritableMap) obj;
                O90.f(writableMap, "$this$dispatch");
                writableMap.putArray("audioTracks", C7467uj1.a(this.f, this.g));
                break;
            case 1:
                WritableMap writableMap2 = (WritableMap) obj;
                O90.f(writableMap2, "$this$dispatch");
                writableMap2.putArray("textTracks", C7467uj1.b(this.f, this.g));
                break;
            default:
                WritableMap writableMap3 = (WritableMap) obj;
                O90.f(writableMap3, "$this$dispatch");
                writableMap3.putArray("videoTracks", C7467uj1.c(this.f, this.g));
                break;
        }
        return C1518Tf1.a;
    }
}

package defpackage;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import java.util.ArrayList;

/* renamed from: mU, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5893mU extends AbstractC1676Vg0 implements InterfaceC6099nZ {
    public final /* synthetic */ int e;
    public final /* synthetic */ ArrayList f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C5893mU(ArrayList arrayList, int i) {
        super(1);
        this.e = i;
        this.f = arrayList;
    }

    @Override // defpackage.InterfaceC6099nZ
    public final Object invoke(Object obj) {
        switch (this.e) {
            case 0:
                String str = (String) obj;
                O90.f(str, "it");
                this.f.add(str);
                return C1518Tf1.a;
            default:
                WritableMap writableMap = (WritableMap) obj;
                O90.f(writableMap, "$this$dispatch");
                WritableArray writableArrayCreateArray = Arguments.createArray();
                int i = 0;
                for (Object obj2 : this.f) {
                    int i2 = i + 1;
                    if (i < 0) {
                        AbstractC8259yu.j();
                        throw null;
                    }
                    C8201ya1 c8201ya1 = (C8201ya1) obj2;
                    WritableMap writableMapCreateMap = Arguments.createMap();
                    writableMapCreateMap.putString("identifier", c8201ya1.a);
                    writableMapCreateMap.putString("value", c8201ya1.b);
                    writableArrayCreateArray.pushMap(writableMapCreateMap);
                    i = i2;
                }
                writableMap.putArray("metadata", writableArrayCreateArray);
                return C1518Tf1.a;
        }
    }
}

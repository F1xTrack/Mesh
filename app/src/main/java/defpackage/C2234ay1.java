package defpackage;

import com.yandex.varioqub.config.model.ConfigValue;
import java.util.List;

/* renamed from: ay1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2234ay1 extends AbstractC4257hz1 {
    public final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2234ay1(String str, int i) {
        super(str);
        this.c = i;
    }

    @Override // defpackage.AbstractC4257hz1
    public final InterfaceC0877Kz1 a(C6860rY0 c6860rY0, List list) {
        switch (this.c) {
            case 0:
                return new C1029My1(Double.valueOf(ConfigValue.DOUBLE_DEFAULT_VALUE));
            case 1:
                return InterfaceC0877Kz1.i1;
            case 2:
            case 3:
                return this;
            default:
                return InterfaceC0877Kz1.i1;
        }
    }
}

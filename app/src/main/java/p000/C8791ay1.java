package p000;

import com.yandex.varioqub.config.model.ConfigValue;
import java.util.List;

/* renamed from: ay1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8791ay1 extends AbstractC9694hz1 {

    /* renamed from: c */
    public final /* synthetic */ int f16694c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C8791ay1(String str, int i) {
        super(str);
        this.f16694c = i;
    }

    @Override // p000.AbstractC9694hz1
    /* renamed from: a */
    public final InterfaceC7885Kz1 mo6842a(C10919rY0 c10919rY0, List list) {
        switch (this.f16694c) {
            case 0:
                return new C7987My1(Double.valueOf(ConfigValue.DOUBLE_DEFAULT_VALUE));
            case 1:
                return InterfaceC7885Kz1.f6417i1;
            case 2:
            case 3:
                return this;
            default:
                return InterfaceC7885Kz1.f6417i1;
        }
    }
}

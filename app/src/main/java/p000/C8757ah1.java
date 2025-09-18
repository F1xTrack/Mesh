package p000;

import android.net.Uri;
import com.huawei.hms.push.constant.RemoteMessageConst;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: ah1 */
/* loaded from: classes.dex */
public final class C8757ah1 implements InterfaceC11215ts0 {

    /* renamed from: b */
    public static final Set f15616b = Collections.unmodifiableSet(new HashSet(Arrays.asList("file", "android.resource", RemoteMessageConst.Notification.CONTENT)));

    /* renamed from: a */
    public final Object f15617a;

    public C8757ah1(C8627Zg1 c8627Zg1) {
        this.f15617a = c8627Zg1;
    }

    @Override // p000.InterfaceC11215ts0
    /* renamed from: a */
    public final boolean mo8529a(Object obj) {
        return f15616b.contains(((Uri) obj).getScheme());
    }

    @Override // p000.InterfaceC11215ts0
    /* renamed from: b */
    public final C11087ss0 mo8530b(Object obj, int i, int i2, C7830Jy0 c7830Jy0) {
        InterfaceC0643KC c1646a9;
        Uri uri = (Uri) obj;
        C8606Yw0 c8606Yw0 = new C8606Yw0(uri);
        C8627Zg1 c8627Zg1 = (C8627Zg1) this.f15617a;
        switch (c8627Zg1.f15090a) {
            case 0:
                c1646a9 = new C1646a9(c8627Zg1.f15091b, uri, 0);
                break;
            case 1:
                c1646a9 = new C1646a9(c8627Zg1.f15091b, uri, 1);
                break;
            default:
                c1646a9 = new C9326f51(1, uri, c8627Zg1.f15091b);
                break;
        }
        return new C11087ss0(c8606Yw0, c1646a9);
    }
}

package p000;

import android.content.res.AssetManager;
import android.content.res.Resources;
import android.net.Uri;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* renamed from: g9 */
/* loaded from: classes.dex */
public final class C4098g9 implements InterfaceC11215ts0 {

    /* renamed from: a */
    public final /* synthetic */ int f27585a;

    /* renamed from: b */
    public final Object f27586b;

    /* renamed from: c */
    public final Object f27587c;

    public /* synthetic */ C4098g9(Object obj, int i, Object obj2) {
        this.f27585a = i;
        this.f27586b = obj;
        this.f27587c = obj2;
    }

    @Override // p000.InterfaceC11215ts0
    /* renamed from: a */
    public final boolean mo8529a(Object obj) {
        switch (this.f27585a) {
            case 0:
                Uri uri = (Uri) obj;
                return "file".equals(uri.getScheme()) && !uri.getPathSegments().isEmpty() && "android_asset".equals(uri.getPathSegments().get(0));
            case 1:
                Iterator it = ((ArrayList) this.f27586b).iterator();
                while (it.hasNext()) {
                    if (((InterfaceC11215ts0) it.next()).mo8529a(obj)) {
                        return true;
                    }
                }
                return false;
            default:
                return true;
        }
    }

    @Override // p000.InterfaceC11215ts0
    /* renamed from: b */
    public final C11087ss0 mo8530b(Object obj, int i, int i2, C7830Jy0 c7830Jy0) {
        C7077wT c7077wT;
        C11087ss0 c11087ss0Mo8530b;
        Uri uri;
        switch (this.f27585a) {
            case 0:
                Uri uri2 = (Uri) obj;
                String strSubstring = uri2.toString().substring(22);
                C8606Yw0 c8606Yw0 = new C8606Yw0(uri2);
                Object obj2 = this.f27587c;
                AssetManager assetManager = (AssetManager) this.f27586b;
                switch (((C4035f9) obj2).f27088a) {
                    case 0:
                        c7077wT = new C7077wT(assetManager, strSubstring, 0);
                        break;
                    default:
                        c7077wT = new C7077wT(assetManager, strSubstring, 1);
                        break;
                }
                return new C11087ss0(c8606Yw0, c7077wT);
            case 1:
                ArrayList arrayList = (ArrayList) this.f27586b;
                int size = arrayList.size();
                ArrayList arrayList2 = new ArrayList(size);
                InterfaceC7740If0 interfaceC7740If0 = null;
                for (int i3 = 0; i3 < size; i3++) {
                    InterfaceC11215ts0 interfaceC11215ts0 = (InterfaceC11215ts0) arrayList.get(i3);
                    if (interfaceC11215ts0.mo8529a(obj) && (c11087ss0Mo8530b = interfaceC11215ts0.mo8530b(obj, i, i2, c7830Jy0)) != null) {
                        arrayList2.add(c11087ss0Mo8530b.f42649c);
                        interfaceC7740If0 = c11087ss0Mo8530b.f42647a;
                    }
                }
                if (arrayList2.isEmpty() || interfaceC7740If0 == null) {
                    return null;
                }
                return new C11087ss0(interfaceC7740If0, new C10449nt0(arrayList2, (C8539Xo1) this.f27587c));
            default:
                Integer num = (Integer) obj;
                Resources resources = (Resources) this.f27587c;
                try {
                    uri = Uri.parse("android.resource://" + resources.getResourcePackageName(num.intValue()) + '/' + resources.getResourceTypeName(num.intValue()) + '/' + resources.getResourceEntryName(num.intValue()));
                } catch (Resources.NotFoundException unused) {
                    uri = null;
                }
                if (uri == null) {
                    return null;
                }
                return ((InterfaceC11215ts0) this.f27586b).mo8530b(uri, i, i2, c7830Jy0);
        }
    }

    public String toString() {
        switch (this.f27585a) {
            case 1:
                return "MultiModelLoader{modelLoaders=" + Arrays.toString(((ArrayList) this.f27586b).toArray()) + '}';
            default:
                return super.toString();
        }
    }

    public C4098g9(Resources resources, InterfaceC11215ts0 interfaceC11215ts0) {
        this.f27585a = 2;
        this.f27587c = resources;
        this.f27586b = interfaceC11215ts0;
    }
}

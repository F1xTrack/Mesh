package p000;

import android.content.ContentProviderClient;
import android.content.Context;
import android.database.Cursor;
import android.location.Location;
import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.MenuItem;
import androidx.appcompat.widget.Toolbar;
import androidx.camera.camera2.internal.compat.quirk.ExtraCroppingQuirk;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.common.internal.ICancelToken;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* renamed from: uQ0 */
/* loaded from: classes.dex */
public final class C11287uQ0 implements InterfaceC4243iS, InterfaceC10231mA0, InterfaceC7346Aq0, InterfaceC8244Rx0, InterfaceC9051cy0, RemoteCall, InterfaceC9435fy0, InterfaceC11050sZ1 {

    /* renamed from: a */
    public Object f43693a;

    public /* synthetic */ C11287uQ0(Object obj) {
        this.f43693a = obj;
    }

    /* renamed from: a */
    public void m25186a() {
        Thread threadCurrentThread = Thread.currentThread();
        if (((Thread) this.f43693a) == null) {
            this.f43693a = threadCurrentThread;
        }
        UN1.m7997a(O90.m5963a((Thread) this.f43693a, threadCurrentThread));
    }

    @Override // com.google.android.gms.common.api.internal.RemoteCall
    public void accept(Object obj, Object obj2) {
        Api.ClientKey clientKey = RB1.f10059a;
        ((C11900zE1) obj).m26349p((Location) this.f43693a, (S81) obj2);
    }

    @Override // p000.InterfaceC9435fy0
    /* renamed from: b */
    public void mo8196b() {
        try {
            ((ICancelToken) this.f43693a).cancel();
        } catch (RemoteException unused) {
        }
    }

    @Override // p000.InterfaceC11050sZ1
    /* renamed from: c */
    public void mo23757c(String str, String str2, Bundle bundle) {
        boolean zIsEmpty = TextUtils.isEmpty(str);
        FR1 fr1 = (FR1) this.f43693a;
        if (zIsEmpty) {
            fr1.m2640J1("auto", "_err", bundle, true, true, ((C9110dP1) fr1.f11615b).f26044n.currentTimeMillis());
        } else {
            ((C9110dP1) fr1.f11615b).getClass();
            throw new IllegalStateException("Unexpected call on client side");
        }
    }

    /* renamed from: d */
    public C11685xY0 m25187d() {
        C11685xY0 c11685xY0 = new C11685xY0();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : ((LinkedHashMap) this.f43693a).entrySet()) {
            C9530gh1 c9530gh1 = (C9530gh1) entry.getValue();
            if (c9530gh1.f27939e) {
                c11685xY0.m25911a(c9530gh1.f27935a);
                arrayList.add((String) entry.getKey());
            }
        }
        arrayList.toString();
        AbstractC7806Jm0.m4412f("UseCaseAttachState");
        return c11685xY0;
    }

    /* renamed from: e */
    public Collection m25188e() {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : ((LinkedHashMap) this.f43693a).entrySet()) {
            if (((C9530gh1) entry.getValue()).f27939e) {
                arrayList.add(((C9530gh1) entry.getValue()).f27935a);
            }
        }
        return Collections.unmodifiableCollection(arrayList);
    }

    /* renamed from: f */
    public Collection m25189f() {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : ((LinkedHashMap) this.f43693a).entrySet()) {
            if (((C9530gh1) entry.getValue()).f27939e) {
                arrayList.add(((C9530gh1) entry.getValue()).f27936b);
            }
        }
        return Collections.unmodifiableCollection(arrayList);
    }

    @Override // p000.InterfaceC7346Aq0
    /* renamed from: g */
    public boolean mo346g(MenuC7450Cq0 menuC7450Cq0, MenuItem menuItem) {
        C10525oT0 c10525oT0 = ((Toolbar) this.f43693a).f15883O;
        return false;
    }

    @Override // javax.inject.Provider
    public Object get() {
        return new GV0((Context) ((C7668Gv0) this.f43693a).f3961a, "com.google.android.datatransport.events", Integer.valueOf(GV0.f3768d).intValue());
    }

    /* renamed from: h */
    public boolean m25190h(String str) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.f43693a;
        if (linkedHashMap.containsKey(str)) {
            return ((C9530gh1) linkedHashMap.get(str)).f27939e;
        }
        return false;
    }

    @Override // p000.InterfaceC10231mA0
    /* renamed from: i */
    public Object mo5748i(Uri uri, C1771bD c1771bD) throws XmlPullParserException, C10103lA0 {
        try {
            XmlPullParser xmlPullParserNewPullParser = ((XmlPullParserFactory) this.f43693a).newPullParser();
            xmlPullParserNewPullParser.setInput(c1771bD, null);
            return (J31) new O31(uri.toString()).m4548e(xmlPullParserNewPullParser);
        } catch (XmlPullParserException e) {
            throw C10103lA0.m22367b(null, e);
        }
    }

    /* renamed from: j */
    public void m25191j(String str, C11812yY0 c11812yY0, InterfaceC9914jh1 interfaceC9914jh1, C0419Ge c0419Ge, List list) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.f43693a;
        if (linkedHashMap.containsKey(str)) {
            C9530gh1 c9530gh1 = new C9530gh1(c11812yY0, interfaceC9914jh1, c0419Ge, list);
            C9530gh1 c9530gh12 = (C9530gh1) linkedHashMap.get(str);
            c9530gh1.f27939e = c9530gh12.f27939e;
            c9530gh1.f27940f = c9530gh12.f27940f;
            linkedHashMap.put(str, c9530gh1);
        }
    }

    @Override // p000.InterfaceC7346Aq0
    /* renamed from: k */
    public void mo347k(MenuC7450Cq0 menuC7450Cq0) {
        Toolbar toolbar = (Toolbar) this.f43693a;
        C6527o2 c6527o2 = toolbar.f15889a.f15846t;
        if (c6527o2 == null || !c6527o2.m23312j()) {
            Iterator it = toolbar.f15875G.f4549b.iterator();
            while (it.hasNext()) {
                ((C1854cY) ((InterfaceC8594Yq0) it.next())).f17597a.m10083s(menuC7450Cq0);
            }
        }
        C10525oT0 c10525oT0 = toolbar.f15883O;
        if (c10525oT0 != null) {
            c10525oT0.mo347k(menuC7450Cq0);
        }
    }

    /* renamed from: l */
    public Object m25192l() {
        Map mapEmptyMap;
        C11791yN1 c11791yN1 = (C11791yN1) this.f43693a;
        ContentProviderClient contentProviderClientAcquireUnstableContentProviderClient = c11791yN1.f46241a.acquireUnstableContentProviderClient(c11791yN1.f46242b);
        try {
            if (contentProviderClientAcquireUnstableContentProviderClient == null) {
                return Collections.emptyMap();
            }
            Cursor cursorQuery = contentProviderClientAcquireUnstableContentProviderClient.query(c11791yN1.f46242b, C11791yN1.f46240i, null, null, null);
            try {
                if (cursorQuery == null) {
                    mapEmptyMap = Collections.emptyMap();
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                } else {
                    int count = cursorQuery.getCount();
                    if (count == 0) {
                        mapEmptyMap = Collections.emptyMap();
                        cursorQuery.close();
                        contentProviderClientAcquireUnstableContentProviderClient.release();
                    } else {
                        Map c7119x8 = count <= 256 ? new C7119x8(count) : new HashMap(count, 1.0f);
                        while (cursorQuery.moveToNext()) {
                            c7119x8.put(cursorQuery.getString(0), cursorQuery.getString(1));
                        }
                        if (cursorQuery.isAfterLast()) {
                            cursorQuery.close();
                            contentProviderClientAcquireUnstableContentProviderClient.release();
                            return c7119x8;
                        }
                        mapEmptyMap = Collections.emptyMap();
                        cursorQuery.close();
                        contentProviderClientAcquireUnstableContentProviderClient.release();
                    }
                }
                return mapEmptyMap;
            } catch (Throwable th) {
                if (cursorQuery != null) {
                    try {
                        cursorQuery.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        } catch (RemoteException unused) {
            return Collections.emptyMap();
        } finally {
            contentProviderClientAcquireUnstableContentProviderClient.release();
        }
    }

    /* renamed from: m */
    public void m25193m(Bundle bundle, String str) {
        String string;
        C9110dP1 c9110dP1 = (C9110dP1) this.f43693a;
        C11412vO1 c11412vO1 = c9110dP1.f26040j;
        C9110dP1.m17592e(c11412vO1);
        c11412vO1.mo7681v1();
        if (c9110dP1.m17593f()) {
            return;
        }
        if (bundle.isEmpty()) {
            string = null;
        } else {
            if (str.isEmpty()) {
                str = "auto";
            }
            Uri.Builder builder = new Uri.Builder();
            builder.path(str);
            for (String str2 : bundle.keySet()) {
                builder.appendQueryParameter(str2, bundle.getString(str2));
            }
            string = builder.build().toString();
        }
        if (TextUtils.isEmpty(string)) {
            return;
        }
        UM1 um1 = c9110dP1.f26038h;
        C9110dP1.m17589b(um1);
        um1.f11764y.m8354t(string);
        C9110dP1.m17589b(um1);
        um1.f11765z.m18963h(c9110dP1.f26044n.currentTimeMillis());
    }

    /* renamed from: n */
    public boolean m25194n() {
        UM1 um1 = ((C9110dP1) this.f43693a).f26038h;
        C9110dP1.m17589b(um1);
        return um1.f11765z.m18962g() > 0;
    }

    /* renamed from: o */
    public boolean m25195o() {
        if (!m25194n()) {
            return false;
        }
        C9110dP1 c9110dP1 = (C9110dP1) this.f43693a;
        long jCurrentTimeMillis = c9110dP1.f26044n.currentTimeMillis();
        UM1 um1 = c9110dP1.f26038h;
        C9110dP1.m17589b(um1);
        return jCurrentTimeMillis - um1.f11765z.m18962g() > c9110dP1.f26037g.m6507A1(null, IB1.f4793e0);
    }

    @Override // p000.InterfaceC8244Rx0
    public void onFailure(Exception exc) {
        ((CountDownLatch) this.f43693a).countDown();
    }

    @Override // p000.InterfaceC9051cy0
    public void onSuccess(Object obj) {
        ((CountDownLatch) this.f43693a).countDown();
    }

    public C11287uQ0(int i) {
        switch (i) {
            case 4:
                try {
                    this.f43693a = XmlPullParserFactory.newInstance();
                    return;
                } catch (XmlPullParserException e) {
                    throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e);
                }
            case 11:
                this.f43693a = new CountDownLatch(1);
                return;
            default:
                this.f43693a = (ExtraCroppingQuirk) AbstractC7067wJ.f44776a.m17864z0(ExtraCroppingQuirk.class);
                return;
        }
    }
}

package p000;

import com.p019vk.push.common.messaging.RemoteMessage;
import com.p019vk.push.core.data.source.ManifestDataSource;
import expo.modules.adapters.react.NativeModulesProxy;
import java.io.File;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.ref.WeakReference;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;
import kotlin.Pair;
import ru.rustore.sdk.remoteconfig.RemoteConfig;
import ru.rustore.sdk.remoteconfig.internal.controller.PersistableConfigSyncJobService;

/* renamed from: qd0 */
/* loaded from: classes2.dex */
public final class C10801qd0 extends AbstractC8418Vg0 implements InterfaceC6434mZ {

    /* renamed from: e */
    public final /* synthetic */ int f41068e;

    /* renamed from: f */
    public final /* synthetic */ Object f41069f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C10801qd0(int i, Object obj) {
        super(0);
        this.f41068e = i;
        this.f41069f = obj;
    }

    /* renamed from: a */
    private final Object m24029a() {
        File file = (File) ((I11) this.f41069f).f4651a.invoke();
        String absolutePath = file.getAbsolutePath();
        synchronized (I11.f4650j) {
            LinkedHashSet linkedHashSet = I11.f4649i;
            if (linkedHashSet.contains(absolutePath)) {
                throw new IllegalStateException(("There are multiple DataStores active for the same file: " + file + ". You should either maintain your DataStore as a singleton or confirm that there is no two DataStore's active on the same file (by confirming that the scope is cancelled).").toString());
            }
            O90.m5967e(absolutePath, "it");
            linkedHashSet.add(absolutePath);
        }
        return file;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v110, types: [java.lang.Object, nZ] */
    /* JADX WARN: Type inference failed for: r4v17, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8, types: [java.lang.Object] */
    @Override // p000.InterfaceC6434mZ
    public final Object invoke() throws NoSuchAlgorithmException, IOException, KeyStoreException, CertificateException {
        Object obj;
        C7558Es0 next;
        C8048Od0 c8048Od0;
        NativeModulesProxy nativeModulesProxy;
        Object next2;
        Object next3;
        InterfaceC10931re0 interfaceC10931re0;
        Pair pair;
        Object next4;
        switch (this.f41068e) {
            case 0:
                C10929rd0 c10929rd0 = (C10929rd0) this.f41069f;
                Collection collectionValues = ((Map) WS1.m8763b(c10929rd0.f41778c.f3393j, C7588Fh0.f3390n[0])).values();
                ArrayList arrayList = new ArrayList();
                Iterator it = collectionValues.iterator();
                while (it.hasNext()) {
                    C1151SI c1151siM4942a = ((C0712LI) ((C9773ib0) c10929rd0.f41777b.f38228b).f29341d).m4942a(c10929rd0.f41778c, (C11667xP0) it.next());
                    if (c1151siM4942a != null) {
                        arrayList.add(c1151siM4942a);
                    }
                }
                return (InterfaceC10059kq0[]) AbstractC10906rR1.m24341f(arrayList).toArray(new InterfaceC10059kq0[0]);
            case 1:
                return AbstractC11852ys0.m26268a(((AbstractC10675pe0) this.f41069f).mo2807b());
            case 2:
                return new C11951ze0((C7322Ae0) this.f41069f);
            case 3:
                return new C7478De0((C7530Ee0) this.f41069f);
            case 4:
                return new C7582Fe0((C7634Ge0) this.f41069f);
            case 5:
                List upperBounds = ((C11826yf0) this.f41069f).f46380a.getUpperBounds();
                O90.m5967e(upperBounds, "getUpperBounds(...)");
                List list = upperBounds;
                ArrayList arrayList2 = new ArrayList(AbstractC7293zu.m26586k(list));
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(new C11572wf0((AbstractC7742Ig0) it2.next(), null));
                }
                return arrayList2;
            case 6:
                return Float.valueOf(((C10226m71) this.f41069f).m22682i().f5355d);
            case 7:
                return new C8572Yf0((C1753aw) this.f41069f);
            case 8:
                InterfaceC10059kq0 interfaceC10059kq0 = (InterfaceC10059kq0) ((InterfaceC6434mZ) this.f41069f).invoke();
                return interfaceC10059kq0 instanceof C8576Yh0 ? ((C8576Yh0) interfaceC10059kq0).m9336h() : interfaceC10059kq0;
            case 9:
                return ManifestDataSource.access$getMetaDataBundle((ManifestDataSource) this.f41069f);
            case 10:
                AbstractC11598ws0 abstractC11598ws0 = (AbstractC11598ws0) this.f41069f;
                C0134C7 c0134c7M25721b = abstractC11598ws0.m25721b();
                try {
                    obj = c0134c7M25721b.f1196a.f5762a.get(InterfaceC7262zP.class);
                } catch (Exception unused) {
                    obj = null;
                }
                InterfaceC7262zP interfaceC7262zP = (InterfaceC7262zP) obj;
                if (interfaceC7262zP == null) {
                    return null;
                }
                C7766Is0 c7766Is0 = c0134c7M25721b.f1198c;
                c7766Is0.getClass();
                Iterator it3 = c7766Is0.f5190b.values().iterator();
                while (true) {
                    if (it3.hasNext()) {
                        next = it3.next();
                        if (((C7558Es0) next).f2933a == abstractC11598ws0) {
                        }
                    } else {
                        next = 0;
                    }
                }
                C7558Es0 c7558Es0 = next instanceof C7558Es0 ? next : null;
                if (c7558Es0 != null) {
                    return new C11443ve0(c7558Es0, interfaceC7262zP, c0134c7M25721b.f1197b);
                }
                throw new IllegalArgumentException("Cannot create an event emitter for the module that isn't present in the module registry.");
            case 11:
                C7878Kw0 c7878Kw0 = (C7878Kw0) this.f41069f;
                synchronized (c7878Kw0.f6394c) {
                    try {
                        c8048Od0 = c7878Kw0.f6392a.f10373a;
                        if (c8048Od0 == null) {
                            C11476vu1 c11476vu1M17774a = c7878Kw0.f6393b.m17774a();
                            c8048Od0 = c11476vu1M17774a != null ? new C8048Od0(new RemoteConfig(c11476vu1M17774a.f44598b), c11476vu1M17774a.f44600d) : null;
                            c7878Kw0.f6392a.f10373a = c8048Od0;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return c8048Od0;
            case 12:
                WeakReference weakReference = ((C10835qu0) this.f41069f).m25721b().f1209n;
                Map<String, Object> constants = (weakReference == null || (nativeModulesProxy = (NativeModulesProxy) weakReference.get()) == null) ? null : nativeModulesProxy.getConstants();
                return constants == null ? C0842NN.f7735a : constants;
            case 13:
                InterfaceC6434mZ interfaceC6434mZ = ((C10709pv0) this.f41069f).f40435b;
                if (interfaceC6434mZ != null) {
                    return (List) interfaceC6434mZ.invoke();
                }
                return null;
            case 14:
                Pair[] pairArr = (Pair[]) this.f41069f;
                int length = pairArr.length;
                if (length == 0) {
                    return C0842NN.f7735a;
                }
                if (length == 1) {
                    return AbstractC11205tn0.m24984c(pairArr[0]);
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC11205tn0.m24983b(pairArr.length));
                AbstractC11077sn0.m24784l(linkedHashMap, pairArr);
                return linkedHashMap;
            case 15:
                PersistableConfigSyncJobService persistableConfigSyncJobService = (PersistableConfigSyncJobService) this.f41069f;
                int iInvoke = persistableConfigSyncJobService.f42144a.invoke();
                if (iInvoke == 0) {
                    throw null;
                }
                int i = iInvoke - 1;
                InterfaceC10775qQ0 interfaceC10775qQ0 = persistableConfigSyncJobService.f42145b;
                if (i != 1) {
                    if (i == 2) {
                    }
                    return C8313Tf1.f11463a;
                }
                interfaceC10775qQ0.mo1680b();
                interfaceC10775qQ0.mo1682d();
                return C8313Tf1.f11463a;
            case 16:
                C10891rK0 c10891rK0 = (C10891rK0) this.f41069f;
                if (c10891rK0.f41594x) {
                    c10891rK0.m24295J();
                }
                return C8313Tf1.f11463a;
            case 17:
                File file = (File) ((C7053w5) this.f41069f).invoke();
                String name = file.getName();
                O90.m5967e(name, "getName(...)");
                if (AbstractC11374v51.m25346U('.', name, "").equals("preferences_pb")) {
                    return file;
                }
                throw new IllegalStateException(("File extension for file: " + file + " does not match required extension for Preferences file: preferences_pb").toString());
            case 18:
                E20 e20 = ((FN0) this.f41069f).f3177e;
                O90.m5965c(e20);
                List<Certificate> listM1987a = e20.m1987a();
                ArrayList arrayList3 = new ArrayList(AbstractC7293zu.m26586k(listM1987a));
                for (Certificate certificate : listM1987a) {
                    O90.m5966d(certificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                    arrayList3.add((X509Certificate) certificate);
                }
                return arrayList3;
            case 19:
                TN0 tn0 = (TN0) this.f41069f;
                InterfaceC9779ie0 interfaceC9779ie0Mo8539i = tn0.f11332d.mo8539i();
                O90.m5966d(interfaceC9779ie0Mo8539i, "null cannot be cast to non-null type kotlin.reflect.KClass<*>");
                ArrayList arrayListM7866a = U22.m7866a((InterfaceC8412Vd0) interfaceC9779ie0Mo8539i);
                ArrayList arrayList4 = new ArrayList(AbstractC7293zu.m26586k(arrayListM7866a));
                Iterator it4 = arrayListM7866a.iterator();
                while (it4.hasNext()) {
                    InterfaceC9141df0 interfaceC9141df0 = (InterfaceC9141df0) it4.next();
                    Iterator it5 = interfaceC9141df0.getAnnotations().iterator();
                    while (true) {
                        if (it5.hasNext()) {
                            next2 = it5.next();
                            if (((Annotation) next2) instanceof InterfaceC1787bT) {
                            }
                        } else {
                            next2 = null;
                        }
                    }
                    InterfaceC1787bT interfaceC1787bT = (InterfaceC1787bT) next2;
                    if (interfaceC1787bT == null) {
                        pair = null;
                    } else {
                        AbstractC8309Td1 abstractC8309Td1M8524b = tn0.f11331c.m8524b(interfaceC9141df0.getReturnType());
                        Iterator it6 = interfaceC9141df0.getAnnotations().iterator();
                        while (true) {
                            if (it6.hasNext()) {
                                next3 = it6.next();
                                if (((Annotation) next3) instanceof XR0) {
                                }
                            } else {
                                next3 = null;
                            }
                        }
                        boolean z = false;
                        boolean z2 = ((XR0) next3) != null;
                        List<Annotation> annotations = interfaceC9141df0.getAnnotations();
                        ArrayList arrayList5 = new ArrayList(AbstractC7293zu.m26586k(annotations));
                        for (Annotation annotation : annotations) {
                            Iterator it7 = P22.m6212a(annotation).getAnnotations().iterator();
                            while (true) {
                                if (it7.hasNext()) {
                                    next4 = it7.next();
                                    if (((Annotation) next4) instanceof InterfaceC6965uh) {
                                    }
                                } else {
                                    next4 = null;
                                }
                            }
                            InterfaceC6965uh interfaceC6965uh = (InterfaceC6965uh) next4;
                            arrayList5.add(interfaceC6965uh == null ? null : new Pair(annotation, interfaceC6965uh));
                        }
                        List listM25997y = AbstractC7167xu.m25997y(arrayList5);
                        ArrayList arrayList6 = new ArrayList(AbstractC7293zu.m26586k(listM25997y));
                        Iterator it8 = listM25997y.iterator();
                        if (it8.hasNext()) {
                            Pair pair2 = (Pair) it8.next();
                            InterfaceC8412Vd0 interfaceC8412Vd0Mo3846b = BP0.f799a.mo3846b(((InterfaceC6965uh) pair2.f36703b).binder());
                            Iterator it9 = interfaceC8412Vd0Mo3846b.mo2809g().iterator();
                            InterfaceC10931re0 interfaceC10931re02 = null;
                            while (true) {
                                if (it9.hasNext()) {
                                    ?? next5 = it9.next();
                                    List parameters = ((InterfaceC10931re0) next5).getParameters();
                                    if (!(parameters instanceof Collection) || !parameters.isEmpty()) {
                                        Iterator it10 = parameters.iterator();
                                        while (it10.hasNext()) {
                                            if (!((C8310Te0) ((InterfaceC8154Qe0) it10.next())).m7712m()) {
                                                break;
                                            }
                                        }
                                    }
                                    if (!z) {
                                        interfaceC10931re02 = next5;
                                        z = true;
                                    }
                                } else if (z) {
                                    interfaceC10931re0 = interfaceC10931re02;
                                }
                            }
                            interfaceC10931re0 = null;
                            InterfaceC10931re0 interfaceC10931re03 = interfaceC10931re0;
                            if (interfaceC10931re03 != null) {
                                O90.m5966d(interfaceC10931re03.callBy(C0842NN.f7735a), "null cannot be cast to non-null type expo.modules.kotlin.records.ValidationBinder");
                                throw new ClassCastException();
                            }
                            throw new IllegalArgumentException("Class should have a single no-arg constructor: " + interfaceC8412Vd0Mo3846b);
                        }
                        pair = new Pair(interfaceC9141df0, new SN0(abstractC8309Td1M8524b, interfaceC1787bT, z2, arrayList6));
                    }
                    arrayList4.add(pair);
                }
                return AbstractC11077sn0.m24786n(AbstractC7167xu.m25997y(arrayList4));
            case 20:
                RemoteMessage remoteMessage = (RemoteMessage) this.f41069f;
                RandomAccess stringArrayList = remoteMessage.f20300a.getStringArrayList("vk.data_key");
                RandomAccess randomAccess = C0779MN.f7117a;
                if (stringArrayList == null) {
                    stringArrayList = randomAccess;
                }
                RandomAccess stringArrayList2 = remoteMessage.f20300a.getStringArrayList("vk.data_value");
                if (stringArrayList2 != null) {
                    randomAccess = stringArrayList2;
                }
                return AbstractC11077sn0.m24786n(AbstractC7167xu.m25989i0((Iterable) stringArrayList, (Iterable) randomAccess));
            case 21:
                return new FZ0((InterfaceC4039fD) this.f41069f);
            case 22:
                return LB1.m4919c((InterfaceC8635Zk1) this.f41069f);
            case 23:
                return (InterfaceC10059kq0) ((KV0) this.f41069f).f6131b.invoke(C8054Og0.f8561a);
            case 24:
                C11429vX0 c11429vX0 = (C11429vX0) this.f41069f;
                c11429vX0.f44406f = new X11(c11429vX0.m25437j(), c11429vX0.m25721b().f1196a);
                c11429vX0.f44405e = new C9196e41(c11429vX0.m25437j(), c11429vX0.f44403c);
                KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
                keyStore.load(null);
                c11429vX0.f44404d = keyStore;
                return C8313Tf1.f11463a;
            case 25:
                return this.f41069f;
            case 26:
                return ((AbstractC7598Fm0) this.f41069f).m2773c();
            case 27:
                return m24029a();
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return QS1.m6718b((InterfaceC10292me1) ((C10988s41) this.f41069f).f42247b);
            default:
                T51 t51 = (T51) this.f41069f;
                return t51.m7545i(AbstractC11797yQ1.m26148a(t51.f11149b, null, 3));
        }
    }
}

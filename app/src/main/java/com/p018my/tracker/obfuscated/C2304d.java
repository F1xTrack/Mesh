package com.p018my.tracker.obfuscated;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.json.JSONObject;
import p000.H30;
import p000.InterfaceC8244Rx0;
import p000.InterfaceC9051cy0;
import p000.O91;
import p000.RunnableC8176Qp0;
import p000.RunnableC8339Ts1;

/* renamed from: com.my.tracker.obfuscated.d */
/* loaded from: classes2.dex */
public final class C2304d {

    /* renamed from: a */
    final IapClient f19785a;

    /* renamed from: b */
    final Context f19786b;

    /* renamed from: c */
    final b f19787c;

    /* renamed from: d */
    Set f19788d;

    /* renamed from: com.my.tracker.obfuscated.d$a */
    public static final class a {

        /* renamed from: a */
        final IapClient f19789a;

        /* renamed from: b */
        final Context f19790b;

        public a(IapClient iapClient, Context context) {
            this.f19789a = iapClient;
            this.f19790b = context;
        }

        /* renamed from: a */
        public C2304d m12834a(b bVar) {
            return new C2304d(this.f19789a, bVar, this.f19790b, 0);
        }
    }

    /* renamed from: com.my.tracker.obfuscated.d$b */
    public interface b {
        /* renamed from: a */
        void mo12835a(List list);

        /* renamed from: c */
        void mo12836c(List list);
    }

    /* renamed from: com.my.tracker.obfuscated.d$c */
    public final class c implements InterfaceC9051cy0 {

        /* renamed from: a */
        final int f19791a;

        /* renamed from: b */
        final int f19792b;

        /* renamed from: c */
        final List f19793c = Collections.synchronizedList(new ArrayList());

        /* renamed from: d */
        final List f19794d = Collections.synchronizedList(new ArrayList());

        /* renamed from: e */
        String f19795e;

        public c(int i, int i2) {
            this.f19791a = i;
            this.f19792b = i2;
            AbstractC2391y2.m13568a("OwnedPurchaseLoader: loader created");
        }

        /* renamed from: a */
        public /* synthetic */ void m12839a(Exception exc) {
            AbstractC2391y2.m13569a("AppGalleryHelper: onLoadingPurchasesFailure ", exc);
            C2304d.this.m12833b(this);
        }

        /* renamed from: b */
        public void m12844b(String str) {
            AbstractC2340m.m13295f(new RunnableC2288B(this, 0, str));
        }

        /* renamed from: a */
        public /* synthetic */ void m12840a(String str) {
            Task taskObtainOwnedPurchaseRecord;
            AbstractC2391y2.m13568a("OwnedPurchaseLoader: start loadPurchases");
            OwnedPurchasesReq ownedPurchasesReq = new OwnedPurchasesReq();
            ownedPurchasesReq.setPriceType(this.f19791a);
            ownedPurchasesReq.setContinuationToken(str);
            int i = this.f19792b;
            if (i == 2) {
                taskObtainOwnedPurchaseRecord = C2304d.this.f19785a.obtainOwnedPurchases(ownedPurchasesReq);
            } else {
                if (i != 3) {
                    AbstractC2391y2.m13568a("OwnedPurchaseLoader: invalid source to load purchases");
                    C2304d.this.m12833b(this);
                    return;
                }
                taskObtainOwnedPurchaseRecord = C2304d.this.f19785a.obtainOwnedPurchaseRecord(ownedPurchasesReq);
            }
            taskObtainOwnedPurchaseRecord.mo8872b(new InterfaceC8244Rx0() { // from class: com.my.tracker.obfuscated.A
                @Override // p000.InterfaceC8244Rx0
                public final void onFailure(Exception exc) {
                    this.f19709a.m12839a(exc);
                }
            });
            taskObtainOwnedPurchaseRecord.mo8873c(this);
        }

        @Override // p000.InterfaceC9051cy0
        /* renamed from: b */
        public void onSuccess(OwnedPurchasesResult ownedPurchasesResult) {
            AbstractC2340m.m13290a(new RunnableC2288B(this, 1, ownedPurchasesResult));
        }

        /* renamed from: a */
        public /* synthetic */ void m12837a(OwnedPurchasesResult ownedPurchasesResult) {
            this.f19793c.addAll(ownedPurchasesResult.getInAppPurchaseDataList());
            this.f19794d.addAll(ownedPurchasesResult.getInAppSignature());
            String continuationToken = ownedPurchasesResult.getContinuationToken();
            if (!TextUtils.isEmpty(continuationToken)) {
                AbstractC2391y2.m13568a("OwnedPurchaseLoader: loading more obtainOwnedPurchasesRecord by continuationToken");
                m12844b(continuationToken);
                return;
            }
            if (this.f19793c.isEmpty()) {
                AbstractC2391y2.m13568a("OwnedPurchaseLoader: failure load obtain owned purchases. Purchases is null. source is " + this.f19792b + " priceType is " + this.f19791a);
                C2304d.this.m12833b(this);
                return;
            }
            if (!this.f19794d.isEmpty()) {
                this.f19795e = ownedPurchasesResult.getSignatureAlgorithm();
                C2304d.this.m12830a(this);
                return;
            }
            AbstractC2391y2.m13568a("OwnedPurchaseLoader: failure load obtain owned purchases. Signatures is null. source is " + this.f19792b + " priceType is " + this.f19791a);
            C2304d.this.m12833b(this);
        }
    }

    private C2304d(IapClient iapClient, b bVar, Context context) {
        this.f19785a = iapClient;
        this.f19787c = bVar;
        this.f19786b = context;
        AbstractC2391y2.m13568a("AppGalleryHelper AppGalleryHelper created");
    }

    public /* synthetic */ C2304d(IapClient iapClient, b bVar, Context context, int i) {
        this(iapClient, bVar, context);
    }

    /* renamed from: a */
    public static ArrayList m12813a(List list, List list2, String str, int i) {
        ArrayList arrayList = new ArrayList();
        long jM13528a = AbstractC2383w2.m13528a();
        for (int i2 = 0; i2 < list.size(); i2++) {
            C2312f c2312fM12958a = C2312f.m12958a((String) list.get(i2), (String) list2.get(i2), str, i, jM13528a);
            if (c2312fM12958a == null) {
                AbstractC2391y2.m13568a("AppGalleryHelper: failed to create AppGalleryRawPurchase");
            } else {
                arrayList.add(c2312fM12958a);
            }
        }
        return arrayList;
    }

    /* renamed from: b */
    public /* synthetic */ void m12821b(Intent intent) {
        PurchaseResultInfo purchaseResultInfoFromIntent = this.f19785a.parsePurchaseResultInfoFromIntent(intent);
        int returnCode = purchaseResultInfoFromIntent.getReturnCode();
        if (returnCode == 0) {
            this.f19787c.mo12835a(Collections.singletonList(C2312f.m12958a(purchaseResultInfoFromIntent.getInAppPurchaseData(), purchaseResultInfoFromIntent.getInAppDataSignature(), purchaseResultInfoFromIntent.getSignatureAlgorithm(), 1, AbstractC2383w2.m13528a())));
        } else {
            AbstractC2391y2.m13572b("AppGalleryHelper error: can not getting PurchaseResultInfo. resultCode " + returnCode);
        }
    }

    /* renamed from: a */
    public void m12830a(c cVar) {
        this.f19787c.mo12835a(m12813a(cVar.f19793c, cVar.f19794d, cVar.f19795e, cVar.f19792b));
        m12833b(cVar);
    }

    /* renamed from: b */
    public void m12833b(c cVar) {
        Set set = this.f19788d;
        if (set == null) {
            AbstractC2391y2.m13568a("AppGalleryHelper: can't remove OwnedPurchaseLoader, purchaseLoaders list is null");
            return;
        }
        set.remove(cVar);
        if (set.isEmpty()) {
            this.f19788d = null;
        }
    }

    /* renamed from: a */
    public void m12829a(Intent intent) {
        AbstractC2391y2.m13568a("AppGalleryHelper: starting getAppGalleryPurchaseByIntent");
        AbstractC2340m.m13295f(new O91(this, 14, intent));
    }

    /* renamed from: a */
    public JSONObject m12827a(List list, String str) {
        String str2;
        if (str == null) {
            str2 = "AppGalleryHelper: can't get product by id, id is null";
        } else {
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    JSONObject jSONObject = (JSONObject) it.next();
                    try {
                    } catch (Throwable th) {
                        AbstractC2391y2.m13569a("AppGalleryHelper: error while reading product_id", th);
                    }
                    if (jSONObject.getString("productId").equals(str)) {
                        return jSONObject;
                    }
                }
                return null;
            }
            str2 = "AppGalleryHelper: can't get product by id, productInfoListJson is null";
        }
        AbstractC2391y2.m13568a(str2);
        return null;
    }

    /* renamed from: a */
    public /* synthetic */ void m12818a(Exception exc, List list) {
        AbstractC2391y2.m13569a("AppGalleryHelper: error while loading products ", exc);
        this.f19787c.mo12836c(list);
    }

    /* renamed from: a */
    public /* synthetic */ void m12820a(List list, Exception exc) {
        AbstractC2340m.m13290a(new RunnableC8176Qp0(this, exc, list));
    }

    /* renamed from: a */
    public /* synthetic */ void m12816a(ProductInfoResult productInfoResult, List list) {
        List productInfoList = productInfoResult.getProductInfoList();
        if (productInfoList == null) {
            AbstractC2391y2.m13568a("AppGalleryHelper: productInfoList is null, finish products loading");
        } else {
            ArrayList arrayList = new ArrayList();
            Iterator it = productInfoList.iterator();
            while (it.hasNext()) {
                arrayList.add(m12814a((ProductInfo) it.next()));
            }
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                C2312f c2312f = (C2312f) it2.next();
                c2312f.m12960a(m12827a(arrayList, c2312f.m12963c()));
            }
        }
        this.f19787c.mo12836c(list);
    }

    /* renamed from: a */
    public /* synthetic */ void m12819a(List list, ProductInfoResult productInfoResult) {
        AbstractC2340m.m13290a(new RunnableC8339Ts1(this, productInfoResult, list, 1));
    }

    /* renamed from: a */
    public /* synthetic */ void m12815a(ProductInfoReq productInfoReq, final List list) {
        Task taskObtainProductInfo = this.f19785a.obtainProductInfo(productInfoReq);
        taskObtainProductInfo.mo8872b(new H30(this, 21, list));
        taskObtainProductInfo.mo8873c(new InterfaceC9051cy0() { // from class: Us1
            @Override // p000.InterfaceC9051cy0
            public final void onSuccess(Object obj) {
                this.f12186a.m12819a(list, (ProductInfoResult) obj);
            }
        });
    }

    /* renamed from: a */
    public void m12831a(List list) {
        AbstractC2391y2.m13568a("AppGalleryHelper: start loading all products");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C2312f c2312f = (C2312f) it.next();
            try {
                int i = c2312f.m12965e().getInt("kind");
                if (i == 0) {
                    arrayList.add(c2312f);
                } else if (i == 1) {
                    arrayList2.add(c2312f);
                } else if (i == 2) {
                    arrayList3.add(c2312f);
                }
            } catch (Throwable th) {
                AbstractC2391y2.m13573b("AppGalleryHelper: can not getting price type ", th);
            }
        }
        if (arrayList.size() > 0) {
            m12832a(arrayList, 0);
        }
        if (arrayList2.size() > 0) {
            m12832a(arrayList2, 1);
        }
        if (arrayList3.size() > 0) {
            m12832a(arrayList3, 2);
        }
    }

    /* renamed from: a */
    public void m12828a() {
        HashSet hashSet = new HashSet();
        hashSet.add(new c(0, 2));
        hashSet.add(new c(1, 2));
        hashSet.add(new c(2, 2));
        hashSet.add(new c(0, 3));
        hashSet.add(new c(2, 3));
        this.f19788d = Collections.synchronizedSet(hashSet);
        AbstractC2391y2.m13568a("AppGalleryHelper: purchase loaders created");
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((c) it.next()).m12844b((String) null);
        }
    }

    /* renamed from: a */
    public void m12832a(List list, int i) {
        AbstractC2391y2.m13568a("AppGalleryHelper: start loading products by price");
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext() && hashSet.size() < 200) {
            C2312f c2312f = (C2312f) it.next();
            hashSet.add(c2312f.m12963c());
            arrayList.add(c2312f);
            it.remove();
        }
        AbstractC2391y2.m13568a("AppGalleryHelper: product id's have been detected");
        while (it.hasNext()) {
            C2312f c2312f2 = (C2312f) it.next();
            if (hashSet.contains(c2312f2.m12963c())) {
                arrayList.add(c2312f2);
                it.remove();
            }
        }
        AbstractC2391y2.m13568a("AppGalleryHelper: products deduplication done");
        if (list.size() > 0) {
            AbstractC2391y2.m13568a("AppGalleryHelper: there are still unloaded products, we are loading more");
            m12832a(list, i);
        }
        ProductInfoReq productInfoReq = new ProductInfoReq();
        productInfoReq.setPriceType(i);
        productInfoReq.setProductIds(new ArrayList(hashSet));
        AbstractC2340m.m13295f(new RunnableC8339Ts1(this, productInfoReq, arrayList, 0));
    }

    /* renamed from: a */
    public static a m12812a(Context context) {
        try {
            return new a(Iap.getIapClient(context), context);
        } catch (Throwable th) {
            AbstractC2391y2.m13573b("AppGalleryHelper: creating AppGalleryHelperBuilder failed", th);
            return null;
        }
    }

    /* renamed from: a */
    public static JSONObject m12814a(Object obj) {
        AbstractC2391y2.m13568a("AppGalleryHelper: start parseProductInfoToJson");
        try {
            ProductInfo productInfo = (ProductInfo) obj;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("productId", productInfo.getProductId());
            jSONObject.put("productName", productInfo.getProductName());
            jSONObject.put("productDesc", productInfo.getProductDesc());
            jSONObject.put("currency", productInfo.getCurrency());
            jSONObject.put("price", productInfo.getPrice());
            jSONObject.put("microsPrice", productInfo.getMicrosPrice());
            jSONObject.put("priceType", productInfo.getPriceType());
            jSONObject.put("originalMicroPrice", productInfo.getOriginalMicroPrice());
            jSONObject.put("originalLocalPrice", productInfo.getOriginalLocalPrice());
            jSONObject.put("subPeriod", productInfo.getSubPeriod());
            jSONObject.put("subSpecialPrice", productInfo.getSubSpecialPrice());
            jSONObject.put("subSpecialPriceMicros", productInfo.getSubSpecialPriceMicros());
            jSONObject.put("subSpecialPeriod", productInfo.getSubSpecialPeriod());
            jSONObject.put("subSpecialPeriodCycles", productInfo.getSubSpecialPeriodCycles());
            jSONObject.put("subFreeTrialPeriod", productInfo.getSubFreeTrialPeriod());
            jSONObject.put("subGroupId", productInfo.getSubGroupId());
            jSONObject.put("subGroupTitle", productInfo.getSubGroupTitle());
            jSONObject.put("subProductLevel", productInfo.getSubProductLevel());
            jSONObject.put("status", productInfo.getStatus());
            return jSONObject;
        } catch (NoClassDefFoundError e) {
            AbstractC2391y2.m13573b("AppGalleryHelper: ", e);
            return null;
        } catch (Throwable th) {
            AbstractC2391y2.m13573b("AppGalleryHelper: ", th);
            return null;
        }
    }
}

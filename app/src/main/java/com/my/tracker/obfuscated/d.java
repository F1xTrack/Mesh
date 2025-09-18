package com.my.tracker.obfuscated;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import defpackage.H30;
import defpackage.InterfaceC1415Rx0;
import defpackage.InterfaceC3299cy0;
import defpackage.O91;
import defpackage.RunnableC1313Qp0;
import defpackage.RunnableC1557Ts1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class d {
    final IapClient a;
    final Context b;
    final b c;
    Set d;

    public static final class a {
        final IapClient a;
        final Context b;

        public a(IapClient iapClient, Context context) {
            this.a = iapClient;
            this.b = context;
        }

        public d a(b bVar) {
            return new d(this.a, bVar, this.b, 0);
        }
    }

    public interface b {
        void a(List list);

        void c(List list);
    }

    public final class c implements InterfaceC3299cy0 {
        final int a;
        final int b;
        final List c = Collections.synchronizedList(new ArrayList());
        final List d = Collections.synchronizedList(new ArrayList());
        String e;

        public c(int i, int i2) {
            this.a = i;
            this.b = i2;
            y2.a("OwnedPurchaseLoader: loader created");
        }

        public /* synthetic */ void a(Exception exc) {
            y2.a("AppGalleryHelper: onLoadingPurchasesFailure ", exc);
            d.this.b(this);
        }

        public void b(String str) {
            m.f(new B(this, 0, str));
        }

        public /* synthetic */ void a(String str) {
            Task taskObtainOwnedPurchaseRecord;
            y2.a("OwnedPurchaseLoader: start loadPurchases");
            OwnedPurchasesReq ownedPurchasesReq = new OwnedPurchasesReq();
            ownedPurchasesReq.setPriceType(this.a);
            ownedPurchasesReq.setContinuationToken(str);
            int i = this.b;
            if (i == 2) {
                taskObtainOwnedPurchaseRecord = d.this.a.obtainOwnedPurchases(ownedPurchasesReq);
            } else {
                if (i != 3) {
                    y2.a("OwnedPurchaseLoader: invalid source to load purchases");
                    d.this.b(this);
                    return;
                }
                taskObtainOwnedPurchaseRecord = d.this.a.obtainOwnedPurchaseRecord(ownedPurchasesReq);
            }
            taskObtainOwnedPurchaseRecord.b(new InterfaceC1415Rx0() { // from class: com.my.tracker.obfuscated.A
                @Override // defpackage.InterfaceC1415Rx0
                public final void onFailure(Exception exc) {
                    this.a.a(exc);
                }
            });
            taskObtainOwnedPurchaseRecord.c(this);
        }

        @Override // defpackage.InterfaceC3299cy0
        /* renamed from: b */
        public void onSuccess(OwnedPurchasesResult ownedPurchasesResult) {
            m.a(new B(this, 1, ownedPurchasesResult));
        }

        public /* synthetic */ void a(OwnedPurchasesResult ownedPurchasesResult) {
            this.c.addAll(ownedPurchasesResult.getInAppPurchaseDataList());
            this.d.addAll(ownedPurchasesResult.getInAppSignature());
            String continuationToken = ownedPurchasesResult.getContinuationToken();
            if (!TextUtils.isEmpty(continuationToken)) {
                y2.a("OwnedPurchaseLoader: loading more obtainOwnedPurchasesRecord by continuationToken");
                b(continuationToken);
                return;
            }
            if (this.c.isEmpty()) {
                y2.a("OwnedPurchaseLoader: failure load obtain owned purchases. Purchases is null. source is " + this.b + " priceType is " + this.a);
                d.this.b(this);
                return;
            }
            if (!this.d.isEmpty()) {
                this.e = ownedPurchasesResult.getSignatureAlgorithm();
                d.this.a(this);
                return;
            }
            y2.a("OwnedPurchaseLoader: failure load obtain owned purchases. Signatures is null. source is " + this.b + " priceType is " + this.a);
            d.this.b(this);
        }
    }

    private d(IapClient iapClient, b bVar, Context context) {
        this.a = iapClient;
        this.c = bVar;
        this.b = context;
        y2.a("AppGalleryHelper AppGalleryHelper created");
    }

    public /* synthetic */ d(IapClient iapClient, b bVar, Context context, int i) {
        this(iapClient, bVar, context);
    }

    public static ArrayList a(List list, List list2, String str, int i) {
        ArrayList arrayList = new ArrayList();
        long jA = w2.a();
        for (int i2 = 0; i2 < list.size(); i2++) {
            f fVarA = f.a((String) list.get(i2), (String) list2.get(i2), str, i, jA);
            if (fVarA == null) {
                y2.a("AppGalleryHelper: failed to create AppGalleryRawPurchase");
            } else {
                arrayList.add(fVarA);
            }
        }
        return arrayList;
    }

    public /* synthetic */ void b(Intent intent) {
        PurchaseResultInfo purchaseResultInfoFromIntent = this.a.parsePurchaseResultInfoFromIntent(intent);
        int returnCode = purchaseResultInfoFromIntent.getReturnCode();
        if (returnCode == 0) {
            this.c.a(Collections.singletonList(f.a(purchaseResultInfoFromIntent.getInAppPurchaseData(), purchaseResultInfoFromIntent.getInAppDataSignature(), purchaseResultInfoFromIntent.getSignatureAlgorithm(), 1, w2.a())));
        } else {
            y2.b("AppGalleryHelper error: can not getting PurchaseResultInfo. resultCode " + returnCode);
        }
    }

    public void a(c cVar) {
        this.c.a(a(cVar.c, cVar.d, cVar.e, cVar.b));
        b(cVar);
    }

    public void b(c cVar) {
        Set set = this.d;
        if (set == null) {
            y2.a("AppGalleryHelper: can't remove OwnedPurchaseLoader, purchaseLoaders list is null");
            return;
        }
        set.remove(cVar);
        if (set.isEmpty()) {
            this.d = null;
        }
    }

    public void a(Intent intent) {
        y2.a("AppGalleryHelper: starting getAppGalleryPurchaseByIntent");
        m.f(new O91(this, 14, intent));
    }

    public JSONObject a(List list, String str) {
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
                        y2.a("AppGalleryHelper: error while reading product_id", th);
                    }
                    if (jSONObject.getString("productId").equals(str)) {
                        return jSONObject;
                    }
                }
                return null;
            }
            str2 = "AppGalleryHelper: can't get product by id, productInfoListJson is null";
        }
        y2.a(str2);
        return null;
    }

    public /* synthetic */ void a(Exception exc, List list) {
        y2.a("AppGalleryHelper: error while loading products ", exc);
        this.c.c(list);
    }

    public /* synthetic */ void a(List list, Exception exc) {
        m.a(new RunnableC1313Qp0(this, exc, list));
    }

    public /* synthetic */ void a(ProductInfoResult productInfoResult, List list) {
        List productInfoList = productInfoResult.getProductInfoList();
        if (productInfoList == null) {
            y2.a("AppGalleryHelper: productInfoList is null, finish products loading");
        } else {
            ArrayList arrayList = new ArrayList();
            Iterator it = productInfoList.iterator();
            while (it.hasNext()) {
                arrayList.add(a((ProductInfo) it.next()));
            }
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                f fVar = (f) it2.next();
                fVar.a(a(arrayList, fVar.c()));
            }
        }
        this.c.c(list);
    }

    public /* synthetic */ void a(List list, ProductInfoResult productInfoResult) {
        m.a(new RunnableC1557Ts1(this, productInfoResult, list, 1));
    }

    public /* synthetic */ void a(ProductInfoReq productInfoReq, final List list) {
        Task taskObtainProductInfo = this.a.obtainProductInfo(productInfoReq);
        taskObtainProductInfo.b(new H30(this, 21, list));
        taskObtainProductInfo.c(new InterfaceC3299cy0() { // from class: Us1
            @Override // defpackage.InterfaceC3299cy0
            public final void onSuccess(Object obj) {
                this.a.a(list, (ProductInfoResult) obj);
            }
        });
    }

    public void a(List list) {
        y2.a("AppGalleryHelper: start loading all products");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            f fVar = (f) it.next();
            try {
                int i = fVar.e().getInt("kind");
                if (i == 0) {
                    arrayList.add(fVar);
                } else if (i == 1) {
                    arrayList2.add(fVar);
                } else if (i == 2) {
                    arrayList3.add(fVar);
                }
            } catch (Throwable th) {
                y2.b("AppGalleryHelper: can not getting price type ", th);
            }
        }
        if (arrayList.size() > 0) {
            a(arrayList, 0);
        }
        if (arrayList2.size() > 0) {
            a(arrayList2, 1);
        }
        if (arrayList3.size() > 0) {
            a(arrayList3, 2);
        }
    }

    public void a() {
        HashSet hashSet = new HashSet();
        hashSet.add(new c(0, 2));
        hashSet.add(new c(1, 2));
        hashSet.add(new c(2, 2));
        hashSet.add(new c(0, 3));
        hashSet.add(new c(2, 3));
        this.d = Collections.synchronizedSet(hashSet);
        y2.a("AppGalleryHelper: purchase loaders created");
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((c) it.next()).b((String) null);
        }
    }

    public void a(List list, int i) {
        y2.a("AppGalleryHelper: start loading products by price");
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext() && hashSet.size() < 200) {
            f fVar = (f) it.next();
            hashSet.add(fVar.c());
            arrayList.add(fVar);
            it.remove();
        }
        y2.a("AppGalleryHelper: product id's have been detected");
        while (it.hasNext()) {
            f fVar2 = (f) it.next();
            if (hashSet.contains(fVar2.c())) {
                arrayList.add(fVar2);
                it.remove();
            }
        }
        y2.a("AppGalleryHelper: products deduplication done");
        if (list.size() > 0) {
            y2.a("AppGalleryHelper: there are still unloaded products, we are loading more");
            a(list, i);
        }
        ProductInfoReq productInfoReq = new ProductInfoReq();
        productInfoReq.setPriceType(i);
        productInfoReq.setProductIds(new ArrayList(hashSet));
        m.f(new RunnableC1557Ts1(this, productInfoReq, arrayList, 0));
    }

    public static a a(Context context) {
        try {
            return new a(Iap.getIapClient(context), context);
        } catch (Throwable th) {
            y2.b("AppGalleryHelper: creating AppGalleryHelperBuilder failed", th);
            return null;
        }
    }

    public static JSONObject a(Object obj) {
        y2.a("AppGalleryHelper: start parseProductInfoToJson");
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
            y2.b("AppGalleryHelper: ", e);
            return null;
        } catch (Throwable th) {
            y2.b("AppGalleryHelper: ", th);
            return null;
        }
    }
}

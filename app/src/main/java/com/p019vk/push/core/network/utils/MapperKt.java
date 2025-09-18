package com.p019vk.push.core.network.utils;

import com.p019vk.push.common.AppInfo;
import com.p019vk.push.core.network.data.model.AppInfoRemote;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import p000.AbstractC7167xu;
import p000.AbstractC7293zu;
import p000.GT1;
import p000.O90;

@Metadata(m22266d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0018\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0001H\u0000\u001a\f\u0010\u0004\u001a\u00020\u0002*\u00020\u0003H\u0000¨\u0006\u0005"}, m22267d2 = {"getSortedAppInfoListByArbiter", "", "Lcom/vk/push/common/AppInfo;", "Lcom/vk/push/core/network/data/model/AppInfoRemote;", "toAppInfo", "core-network_release"}, m22268k = 2, m22269mv = {1, 7, 1}, m22271xi = 48)
/* loaded from: classes2.dex */
public final class MapperKt {
    public static final List<AppInfo> getSortedAppInfoListByArbiter(List<AppInfoRemote> list) {
        O90.m5968f(list, "<this>");
        List listM25977W = AbstractC7167xu.m25977W(list, new Comparator() { // from class: com.vk.push.core.network.utils.MapperKt$getSortedAppInfoListByArbiter$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return GT1.m3070b(Boolean.valueOf(!((AppInfoRemote) t).getIsArbiter()), Boolean.valueOf(!((AppInfoRemote) t2).getIsArbiter()));
            }
        });
        ArrayList arrayList = new ArrayList(AbstractC7293zu.m26586k(listM25977W));
        Iterator it = listM25977W.iterator();
        while (it.hasNext()) {
            arrayList.add(toAppInfo((AppInfoRemote) it.next()));
        }
        return arrayList;
    }

    public static final AppInfo toAppInfo(AppInfoRemote appInfoRemote) {
        O90.m5968f(appInfoRemote, "<this>");
        return new AppInfo(appInfoRemote.getPackageName(), appInfoRemote.getPubKey());
    }
}

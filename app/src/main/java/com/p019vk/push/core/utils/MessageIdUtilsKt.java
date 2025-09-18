package com.p019vk.push.core.utils;

import com.huawei.hms.p015rn.push.constants.RemoteMessageAttributes;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import kotlin.Metadata;
import p000.AbstractC11374v51;
import p000.AbstractC7167xu;
import p000.O90;

@Metadata(m22266d1 = {"\u0000\"\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a!\u0010\u0000\u001a\u00060\u0001j\u0002`\u0002*\u00060\u0003j\u0002`\u00042\n\u0010\u0005\u001a\u00060\u0003j\u0002`\u0006H\u0086\u0004\u001a%\u0010\u0007\u001a\u00020\u0001*\n\u0018\u00010\u0001j\u0004\u0018\u0001`\b2\u000e\u0010\t\u001a\n\u0018\u00010\u0001j\u0004\u0018\u0001`\u0002H\u0086\u0004\u001a\u0012\u0010\u0005\u001a\u00060\u0003j\u0002`\u0006*\u00060\u0001j\u0002`\u0002*\f\b\u0002\u0010\n\"\u00020\u00012\u00020\u0001*\f\b\u0002\u0010\u000b\"\u00020\u00032\u00020\u0003*\f\b\u0002\u0010\f\"\u00020\u00012\u00020\u0001*\f\b\u0002\u0010\r\"\u00020\u00032\u00020\u0003¨\u0006\u000e"}, m22267d2 = {"formMessageId", "", "Lcom/vk/push/core/utils/MessageId;", "", "Lcom/vk/push/core/utils/ProjectId;", "syn", "Lcom/vk/push/core/utils/Syn;", "formPushId", "Lcom/vk/push/core/utils/PushToken;", RemoteMessageAttributes.MESSAGE_ID, "MessageId", "ProjectId", "PushToken", "Syn", "core_release"}, m22268k = 2, m22269mv = {1, 7, 1}, m22271xi = 48)
/* loaded from: classes2.dex */
public final class MessageIdUtilsKt {
    public static final String formMessageId(long j, long j2) {
        StringBuilder sb = new StringBuilder();
        sb.append(j);
        sb.append(':');
        sb.append(j2);
        return sb.toString();
    }

    public static final String formPushId(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        if (str == null) {
            str = "";
        }
        sb.append(str);
        sb.append(':');
        sb.append(str2 != null ? Long.valueOf(syn(str2)) : "");
        return sb.toString();
    }

    public static final long syn(String str) {
        O90.m5968f(str, "<this>");
        String str2 = (String) AbstractC7167xu.m25958D(1, AbstractC11374v51.m25340O(str, new String[]{StringUtils.PROCESS_POSTFIX_DELIMITER}, 0, 6));
        if (str2 != null) {
            return Long.parseLong(str2);
        }
        return 0L;
    }
}

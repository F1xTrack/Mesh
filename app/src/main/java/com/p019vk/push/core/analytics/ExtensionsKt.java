package com.p019vk.push.core.analytics;

import android.database.sqlite.SQLiteException;
import com.p019vk.push.core.base.exception.HostIsNotMasterException;
import com.p019vk.push.core.base.exception.SdkIsNotInitializedException;
import com.p019vk.push.core.base.exception.TransferredIpcDataException;
import com.p019vk.push.core.ipc.BindingDiedException;
import com.p019vk.push.core.ipc.BindingFailedException;
import com.p019vk.push.core.ipc.ComponentCreationFailedException;
import com.p019vk.push.core.ipc.InvalidSignatureException;
import com.p019vk.push.core.ipc.NoHostsToBindException;
import com.p019vk.push.core.ipc.SecurityBindingException;
import com.p019vk.push.core.ipc.UnknownBindingException;
import com.p019vk.push.core.utils.MessageIdUtilsKt;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import p000.AbstractC11374v51;
import p000.AbstractC7167xu;
import p000.AbstractC7293zu;
import p000.C7173y;
import p000.C7575Fa1;
import p000.O90;
import p000.OS0;
import p000.PS0;

@Metadata(m22266d1 = {"\u0000F\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\b\u001a\u0090\u0001\u0010\u000b\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u0000*\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001j\u0002`\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042*\b\u0002\u0010\b\u001a$\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001j\u0002`\u0003\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00070\u00062*\b\u0002\u0010\n\u001a$\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001j\u0002`\u0003\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00070\u0006ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a+\u0010\u000e\u001a\u00020\u0007*\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001j\u0002`\u00032\b\u0010\r\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000e\u0010\u000f\u001a)\u0010\u0012\u001a\u00020\u0007*\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001j\u0002`\u00032\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013\u001a5\u0010\u0015\u001a\u00020\u0007*\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001j\u0002`\u00032\b\u0010\r\u001a\u0004\u0018\u00010\u00022\b\u0010\u0014\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0015\u0010\u0016\u001a+\u0010\u0015\u001a\u00020\u0007*\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001j\u0002`\u00032\b\u0010\u0017\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0015\u0010\u000f\u001a;\u0010\u001a\u001a\u00020\u0007*\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001j\u0002`\u00032\b\u0010\r\u001a\u0004\u0018\u00010\u00022\u000e\u0010\u0019\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001b\u001a)\u0010\u001d\u001a\u00020\u0007*\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001j\u0002`\u00032\u0006\u0010\u001c\u001a\u00020\u0002¢\u0006\u0004\b\u001d\u0010\u000f\u001a1\u0010!\u001a\u00020\u0007*\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001j\u0002`\u00032\u0006\u0010\u001e\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\u001f¢\u0006\u0004\b!\u0010\"\u001a1\u0010!\u001a\u00020\u0007*\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001j\u0002`\u00032\u0006\u0010\u001e\u001a\u00020\u00022\u0006\u0010#\u001a\u00020\u0010¢\u0006\u0004\b!\u0010$\u001a1\u0010!\u001a\u00020\u0007*\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001j\u0002`\u00032\u0006\u0010\u001e\u001a\u00020\u00022\u0006\u0010#\u001a\u00020%¢\u0006\u0004\b!\u0010&\u001a1\u0010(\u001a\u00020\u0007*\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001j\u0002`\u00032\u0006\u0010\u001e\u001a\u00020\u00022\u0006\u0010'\u001a\u00020\t¢\u0006\u0004\b(\u0010)\u001a7\u0010!\u001a\u00020\u0007*\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001j\u0002`\u00032\u0006\u0010\u001e\u001a\u00020\u00022\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00020\u0018¢\u0006\u0004\b!\u0010\u001b\u001a\u0011\u0010*\u001a\u00020\u0002*\u00020\u001f¢\u0006\u0004\b*\u0010+*\"\u0010,\"\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006-"}, m22267d2 = {"T", "", "", "Lcom/vk/push/core/analytics/Params;", "LPS0;", "result", "Lkotlin/Function2;", "LTf1;", "onSuccess", "", "onFailure", "setResult", "(Ljava/util/Map;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;)V", "pushToken", "setPushToken", "(Ljava/util/Map;Ljava/lang/String;)V", "", "intervalMs", "setIntervalMs", "(Ljava/util/Map;J)V", RemoteMessageAttributes.MESSAGE_ID, "setPushId", "(Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;)V", "pushId", "", "messageIds", "setPushIds", "(Ljava/util/Map;Ljava/lang/String;Ljava/util/List;)V", "clientPackageName", "setClientPackageName", "key", "", "boolean", "set", "(Ljava/util/Map;Ljava/lang/String;Z)V", "value", "(Ljava/util/Map;Ljava/lang/String;J)V", "", "(Ljava/util/Map;Ljava/lang/String;I)V", "error", "setErrorMessage", "(Ljava/util/Map;Ljava/lang/String;Ljava/lang/Throwable;)V", "asString", "(Z)Ljava/lang/String;", "Params", "core_release"}, m22268k = 2, m22269mv = {1, 7, 1}, m22271xi = 48)
/* loaded from: classes2.dex */
public final class ExtensionsKt {
    public static final String asString(boolean z) {
        return z ? "1" : "0";
    }

    public static final void set(Map<String, String> map, String str, boolean z) {
        O90.m5968f(map, "<this>");
        O90.m5968f(str, "key");
        map.put(str, asString(z));
    }

    public static final void setClientPackageName(Map<String, String> map, String str) {
        O90.m5968f(map, "<this>");
        O90.m5968f(str, "clientPackageName");
        map.put("client_package_name", str);
    }

    public static final void setErrorMessage(Map<String, String> map, String str, Throwable th) {
        O90.m5968f(map, "<this>");
        O90.m5968f(str, "key");
        O90.m5968f(th, "error");
        String message = th.getMessage();
        if (message != null) {
            map.put(str, AbstractC11374v51.m25349X(20, message));
        }
    }

    public static final void setIntervalMs(Map<String, String> map, long j) {
        O90.m5968f(map, "<this>");
        map.put("interval", String.valueOf(j));
    }

    public static final void setPushId(Map<String, String> map, String str, String str2) {
        O90.m5968f(map, "<this>");
        map.put("push_id", MessageIdUtilsKt.formPushId(str, str2));
    }

    public static final void setPushIds(Map<String, String> map, String str, List<String> list) {
        O90.m5968f(map, "<this>");
        O90.m5968f(list, "messageIds");
        List<String> list2 = list;
        ArrayList arrayList = new ArrayList(AbstractC7293zu.m26586k(list2));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(MessageIdUtilsKt.formPushId(str, (String) it.next()));
        }
        set(map, "push_ids", arrayList);
    }

    public static final void setPushToken(Map<String, String> map, String str) {
        O90.m5968f(map, "<this>");
        if (str == null) {
            str = "";
        }
        map.put("push_token", str);
    }

    public static final <T> void setResult(Map<String, String> map, Object obj, Function2 function2, Function2 function22) {
        String strConcat;
        O90.m5968f(map, "<this>");
        O90.m5968f(function2, "onSuccess");
        O90.m5968f(function22, "onFailure");
        boolean z = obj instanceof OS0;
        map.put("result", !z ? "success" : "failure");
        if (!z) {
            function2.invoke(map, obj);
        }
        Throwable thM6365a = PS0.m6365a(obj);
        if (thM6365a != null) {
            if (thM6365a instanceof C7575Fa1) {
                strConcat = "timeout_error";
            } else if (thM6365a instanceof HostIsNotMasterException) {
                strConcat = "host_is_not_master";
            } else if (thM6365a instanceof SdkIsNotInitializedException) {
                strConcat = "sdk_is_not_initialized";
            } else if (thM6365a instanceof TransferredIpcDataException) {
                strConcat = "transferred_ipc_data";
            } else if (thM6365a instanceof NoHostsToBindException) {
                NoHostsToBindException noHostsToBindException = (NoHostsToBindException) thM6365a;
                strConcat = noHostsToBindException instanceof BindingFailedException ? "binding_failed" : noHostsToBindException instanceof InvalidSignatureException ? "invalid_signature" : noHostsToBindException instanceof ComponentCreationFailedException ? "component_creation_failed" : noHostsToBindException instanceof SecurityBindingException ? "security_exception" : noHostsToBindException instanceof UnknownBindingException ? "unknown_binding_exception ".concat(AbstractC11374v51.m25349X(20, noHostsToBindException.getClass().getSimpleName())) : "no_hosts_to_bind";
            } else {
                strConcat = thM6365a instanceof BindingDiedException ? "binding_died" : thM6365a instanceof IllegalStateException ? "illegal_state" : thM6365a instanceof IllegalArgumentException ? "illegal_argument" : thM6365a instanceof SQLiteException ? "sqlite_error" : thM6365a instanceof IOException ? "io_error" : "unknown_exception ".concat(AbstractC11374v51.m25349X(20, thM6365a.getClass().getSimpleName()));
            }
            map.put("reason", strConcat);
            setErrorMessage(map, "error_message", thM6365a);
            function22.invoke(map, thM6365a);
        }
    }

    public static /* synthetic */ void setResult$default(Map map, Object obj, Function2 function2, Function2 function22, int i, Object obj2) {
        if ((i & 2) != 0) {
            function2 = C7173y.f45982l;
        }
        if ((i & 4) != 0) {
            function22 = C7173y.f45983m;
        }
        setResult(map, obj, function2, function22);
    }

    public static final void set(Map<String, String> map, String str, long j) {
        O90.m5968f(map, "<this>");
        O90.m5968f(str, "key");
        map.put(str, String.valueOf(j));
    }

    public static final void setPushId(Map<String, String> map, String str) {
        O90.m5968f(map, "<this>");
        if (str == null) {
            str = "";
        }
        map.put("push_id", str);
    }

    public static final void set(Map<String, String> map, String str, int i) {
        O90.m5968f(map, "<this>");
        O90.m5968f(str, "key");
        map.put(str, String.valueOf(i));
    }

    public static final void set(Map<String, String> map, String str, List<String> list) {
        O90.m5968f(map, "<this>");
        O90.m5968f(str, "key");
        O90.m5968f(list, "value");
        map.put(str, AbstractC7167xu.m25962H(list, null, "[", "]", null, 57));
    }
}

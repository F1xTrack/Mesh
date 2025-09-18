package expo.modules.kotlin.exception;

import java.util.Locale;
import java.util.regex.Pattern;
import kotlin.Metadata;
import p000.O90;

@Metadata(m22266d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0017\u0018\u00002\u00060\u0001j\u0002`\u0002B\t\b\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m22267d2 = {"Lexpo/modules/kotlin/exception/CodedException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "<init>", "()V", "expo-modules-core_release"}, m22268k = 1, m22269mv = {1, 9, 0}, m22271xi = 48)
/* loaded from: classes2.dex */
public class CodedException extends Exception {

    /* renamed from: a */
    public final String f26952a;

    public CodedException() {
        super(null, null);
    }

    /* renamed from: a */
    public final String m18088a() {
        String str = this.f26952a;
        if (str != null) {
            return str;
        }
        String simpleName = getClass().getSimpleName();
        Pattern patternCompile = Pattern.compile("(Exception)$");
        O90.m5967e(patternCompile, "compile(...)");
        String strReplaceAll = patternCompile.matcher(simpleName).replaceAll("");
        O90.m5967e(strReplaceAll, "replaceAll(...)");
        Pattern patternCompile2 = Pattern.compile("(.)([A-Z])");
        O90.m5967e(patternCompile2, "compile(...)");
        String strReplaceAll2 = patternCompile2.matcher(strReplaceAll).replaceAll("$1_$2");
        O90.m5967e(strReplaceAll2, "replaceAll(...)");
        Locale locale = Locale.ROOT;
        O90.m5967e(locale, "ROOT");
        String upperCase = strReplaceAll2.toUpperCase(locale);
        O90.m5967e(upperCase, "toUpperCase(...)");
        return "ERR_".concat(upperCase);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CodedException(String str, String str2, Throwable th) {
        super(str2, th);
        O90.m5968f(str, "code");
        this.f26952a = str;
    }
}

package p000;

import android.net.Uri;
import expo.modules.kotlin.exception.CodedException;
import java.security.GeneralSecurityException;

/* renamed from: t2 */
/* loaded from: classes2.dex */
public final class C6861t2 extends CodedException {
    /* JADX WARN: Illegal instructions before constructor call */
    public C6861t2(String str, String str2, String str3, GeneralSecurityException generalSecurityException) {
        O90.m5968f(str2, "key");
        O90.m5968f(str3, "keychain");
        str = str == null ? "unknown" : str;
        StringBuilder sbM2541x = F91.m2541x("Could not encrypt the value for key '", str2, "' under keychain '", str3, "'. Caused by: ");
        sbM2541x.append(str);
        super(sbM2541x.toString(), generalSecurityException);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C6861t2(Uri uri, int i) {
        switch (i) {
            case 17:
                super(F91.m2538u("Uri '", uri, "' doesn't exist or isn't a directory"), null);
                break;
            case 18:
                super(F91.m2538u("File '", uri, "' could not be copied because it could not be found"), null);
                break;
            case 19:
                super(F91.m2538u("File '", uri, "' could not be deleted because it could not be found"), null);
                break;
            default:
                String strM2538u = F91.m2538u("Directory '", uri, "' could not be created or already exists");
                super(strM2538u == null ? "Unknown error" : strM2538u, null);
                break;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C6861t2(String str, String str2, String str3, Throwable th, int i) {
        switch (i) {
            case 3:
                O90.m5968f(str2, "key");
                O90.m5968f(str3, "keychain");
                str = str == null ? "unknown" : str;
                StringBuilder sbM2541x = F91.m2541x("Could not delete the value for key '", str2, "' under keychain '", str3, "'. Caused by: ");
                sbM2541x.append(str);
                super(sbM2541x.toString(), th);
                break;
            default:
                O90.m5968f(str2, "key");
                O90.m5968f(str3, "keychain");
                str = str == null ? "unknown" : str;
                StringBuilder sbM2541x2 = F91.m2541x("Could not decrypt the value for key '", str2, "' under keychain '", str3, "'. Caused by: ");
                sbM2541x2.append(str);
                super(sbM2541x2.toString(), th);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6861t2(String str, int i) {
        super("No readable files with the uri '" + str + "'. Please use other uri", null);
        switch (i) {
            case 29:
                super("An error occurred when accessing the keystore: ".concat(str == null ? "unknown" : str), null);
                break;
            default:
                O90.m5968f(str, "uri");
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6861t2(int i) {
        super("Unable to activate keep awake", null);
        switch (i) {
            case 1:
                super("Unable to deactivate keep awake. However, it probably is deactivated already", null);
                break;
            case 6:
                super("The app context has been lost", null);
                break;
            case 8:
                super("The current activity is no longer available", null);
                break;
            case 9:
                super("The react context has been lost", null);
                break;
            case 15:
                super("Cannot find task", null);
                break;
            case 20:
                super("okHttpClient is null", null);
                break;
            case 21:
                super("You have an unfinished permission request", null);
                break;
            case 23:
                super("Can't read Storage Access Framework directory, use StorageAccessFramework.readDirectoryAsync() instead", null);
                break;
            case 24:
                super("FontManagerInterface not found", null);
                break;
            case 26:
                super("Invalid folly::dynamic extension format", null);
                break;
            default:
                break;
        }
    }

    public C6861t2(Uri uri, Uri uri2) {
        super("File '" + uri + "' could not be moved to '" + uri2 + "'", null);
    }

    public C6861t2(C11572wf0 c11572wf0, C11572wf0 c11572wf02) {
        super("Argument type '" + c11572wf0 + "' is not compatible with expected type '" + c11572wf02 + "'.", null);
    }
}

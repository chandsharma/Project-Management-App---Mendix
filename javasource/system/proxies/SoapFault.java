// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package system.proxies;

public class SoapFault extends system.proxies.Error
{
	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "System.SoapFault";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		Code("Code"),
		Reason("Reason"),
		Node("Node"),
		Role("Role"),
		Detail("Detail"),
		ErrorType("ErrorType"),
		Message("Message"),
		Stacktrace("Stacktrace");

		private java.lang.String metaName;

		MemberNames(java.lang.String s)
		{
			metaName = s;
		}

		@java.lang.Override
		public java.lang.String toString()
		{
			return metaName;
		}
	}

	public SoapFault(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "System.SoapFault"));
	}

	protected SoapFault(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject soapFaultMendixObject)
	{
		super(context, soapFaultMendixObject);
		if (!com.mendix.core.Core.isSubClassOf("System.SoapFault", soapFaultMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a System.SoapFault");
	}

	/**
	 * @deprecated Use 'SoapFault.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static system.proxies.SoapFault initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return system.proxies.SoapFault.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static system.proxies.SoapFault initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new system.proxies.SoapFault(context, mendixObject);
	}

	public static system.proxies.SoapFault load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return system.proxies.SoapFault.initialize(context, mendixObject);
	}

	/**
	 * @return value of Code
	 */
	public final java.lang.String getCode()
	{
		return getCode(getContext());
	}

	/**
	 * @param context
	 * @return value of Code
	 */
	public final java.lang.String getCode(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Code.toString());
	}

	/**
	 * Set value of Code
	 * @param code
	 */
	public final void setCode(java.lang.String code)
	{
		setCode(getContext(), code);
	}

	/**
	 * Set value of Code
	 * @param context
	 * @param code
	 */
	public final void setCode(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String code)
	{
		getMendixObject().setValue(context, MemberNames.Code.toString(), code);
	}

	/**
	 * @return value of Reason
	 */
	public final java.lang.String getReason()
	{
		return getReason(getContext());
	}

	/**
	 * @param context
	 * @return value of Reason
	 */
	public final java.lang.String getReason(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Reason.toString());
	}

	/**
	 * Set value of Reason
	 * @param reason
	 */
	public final void setReason(java.lang.String reason)
	{
		setReason(getContext(), reason);
	}

	/**
	 * Set value of Reason
	 * @param context
	 * @param reason
	 */
	public final void setReason(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String reason)
	{
		getMendixObject().setValue(context, MemberNames.Reason.toString(), reason);
	}

	/**
	 * @return value of Node
	 */
	public final java.lang.String getNode()
	{
		return getNode(getContext());
	}

	/**
	 * @param context
	 * @return value of Node
	 */
	public final java.lang.String getNode(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Node.toString());
	}

	/**
	 * Set value of Node
	 * @param node
	 */
	public final void setNode(java.lang.String node)
	{
		setNode(getContext(), node);
	}

	/**
	 * Set value of Node
	 * @param context
	 * @param node
	 */
	public final void setNode(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String node)
	{
		getMendixObject().setValue(context, MemberNames.Node.toString(), node);
	}

	/**
	 * @return value of Role
	 */
	public final java.lang.String getRole()
	{
		return getRole(getContext());
	}

	/**
	 * @param context
	 * @return value of Role
	 */
	public final java.lang.String getRole(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Role.toString());
	}

	/**
	 * Set value of Role
	 * @param role
	 */
	public final void setRole(java.lang.String role)
	{
		setRole(getContext(), role);
	}

	/**
	 * Set value of Role
	 * @param context
	 * @param role
	 */
	public final void setRole(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String role)
	{
		getMendixObject().setValue(context, MemberNames.Role.toString(), role);
	}

	/**
	 * @return value of Detail
	 */
	public final java.lang.String getDetail()
	{
		return getDetail(getContext());
	}

	/**
	 * @param context
	 * @return value of Detail
	 */
	public final java.lang.String getDetail(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Detail.toString());
	}

	/**
	 * Set value of Detail
	 * @param detail
	 */
	public final void setDetail(java.lang.String detail)
	{
		setDetail(getContext(), detail);
	}

	/**
	 * Set value of Detail
	 * @param context
	 * @param detail
	 */
	public final void setDetail(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String detail)
	{
		getMendixObject().setValue(context, MemberNames.Detail.toString(), detail);
	}

	@java.lang.Override
	public boolean equals(Object obj)
	{
		if (obj == this)
			return true;

		if (obj != null && getClass().equals(obj.getClass()))
		{
			final system.proxies.SoapFault that = (system.proxies.SoapFault) obj;
			return getMendixObject().equals(that.getMendixObject());
		}
		return false;
	}

	@java.lang.Override
	public int hashCode()
	{
		return getMendixObject().hashCode();
	}

	/**
	 * @return String name of this class
	 */
	public static java.lang.String getType()
	{
		return "System.SoapFault";
	}

	/**
	 * @return String GUID from this object, format: ID_0000000000
	 * @deprecated Use getMendixObject().getId().toLong() to get a unique identifier for this object.
	 */
	@java.lang.Override
	@java.lang.Deprecated
	public java.lang.String getGUID()
	{
		return "ID_" + getMendixObject().getId().toLong();
	}
}

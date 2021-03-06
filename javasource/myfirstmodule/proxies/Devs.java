// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package myfirstmodule.proxies;

public class Devs
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject devsMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "MyFirstModule.Devs";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		Name("Name"),
		Title("Title"),
		DoB("DoB"),
		Age("Age"),
		Phone("Phone"),
		Email("Email"),
		Sex("Sex"),
		Work_Status("Work_Status"),
		Devs_Stories("MyFirstModule.Devs_Stories");

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

	public Devs(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "MyFirstModule.Devs"));
	}

	protected Devs(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject devsMendixObject)
	{
		if (devsMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("MyFirstModule.Devs", devsMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a MyFirstModule.Devs");

		this.devsMendixObject = devsMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'Devs.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static myfirstmodule.proxies.Devs initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return myfirstmodule.proxies.Devs.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static myfirstmodule.proxies.Devs initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new myfirstmodule.proxies.Devs(context, mendixObject);
	}

	public static myfirstmodule.proxies.Devs load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return myfirstmodule.proxies.Devs.initialize(context, mendixObject);
	}

	public static java.util.List<myfirstmodule.proxies.Devs> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<myfirstmodule.proxies.Devs> result = new java.util.ArrayList<myfirstmodule.proxies.Devs>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//MyFirstModule.Devs" + xpathConstraint))
			result.add(myfirstmodule.proxies.Devs.initialize(context, obj));
		return result;
	}

	/**
	 * Commit the changes made on this proxy object.
	 */
	public final void commit() throws com.mendix.core.CoreException
	{
		com.mendix.core.Core.commit(context, getMendixObject());
	}

	/**
	 * Commit the changes made on this proxy object using the specified context.
	 */
	public final void commit(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		com.mendix.core.Core.commit(context, getMendixObject());
	}

	/**
	 * Delete the object.
	 */
	public final void delete()
	{
		com.mendix.core.Core.delete(context, getMendixObject());
	}

	/**
	 * Delete the object using the specified context.
	 */
	public final void delete(com.mendix.systemwideinterfaces.core.IContext context)
	{
		com.mendix.core.Core.delete(context, getMendixObject());
	}
	/**
	 * @return value of Name
	 */
	public final java.lang.String getName()
	{
		return getName(getContext());
	}

	/**
	 * @param context
	 * @return value of Name
	 */
	public final java.lang.String getName(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Name.toString());
	}

	/**
	 * Set value of Name
	 * @param name
	 */
	public final void setName(java.lang.String name)
	{
		setName(getContext(), name);
	}

	/**
	 * Set value of Name
	 * @param context
	 * @param name
	 */
	public final void setName(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String name)
	{
		getMendixObject().setValue(context, MemberNames.Name.toString(), name);
	}

	/**
	 * @return value of Title
	 */
	public final java.lang.String getTitle()
	{
		return getTitle(getContext());
	}

	/**
	 * @param context
	 * @return value of Title
	 */
	public final java.lang.String getTitle(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Title.toString());
	}

	/**
	 * Set value of Title
	 * @param title
	 */
	public final void setTitle(java.lang.String title)
	{
		setTitle(getContext(), title);
	}

	/**
	 * Set value of Title
	 * @param context
	 * @param title
	 */
	public final void setTitle(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String title)
	{
		getMendixObject().setValue(context, MemberNames.Title.toString(), title);
	}

	/**
	 * @return value of DoB
	 */
	public final java.util.Date getDoB()
	{
		return getDoB(getContext());
	}

	/**
	 * @param context
	 * @return value of DoB
	 */
	public final java.util.Date getDoB(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.util.Date) getMendixObject().getValue(context, MemberNames.DoB.toString());
	}

	/**
	 * Set value of DoB
	 * @param dob
	 */
	public final void setDoB(java.util.Date dob)
	{
		setDoB(getContext(), dob);
	}

	/**
	 * Set value of DoB
	 * @param context
	 * @param dob
	 */
	public final void setDoB(com.mendix.systemwideinterfaces.core.IContext context, java.util.Date dob)
	{
		getMendixObject().setValue(context, MemberNames.DoB.toString(), dob);
	}

	/**
	 * @return value of Age
	 */
	public final java.lang.Integer getAge()
	{
		return getAge(getContext());
	}

	/**
	 * @param context
	 * @return value of Age
	 */
	public final java.lang.Integer getAge(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Integer) getMendixObject().getValue(context, MemberNames.Age.toString());
	}

	/**
	 * Set value of Age
	 * @param age
	 */
	public final void setAge(java.lang.Integer age)
	{
		setAge(getContext(), age);
	}

	/**
	 * Set value of Age
	 * @param context
	 * @param age
	 */
	public final void setAge(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Integer age)
	{
		getMendixObject().setValue(context, MemberNames.Age.toString(), age);
	}

	/**
	 * @return value of Phone
	 */
	public final java.lang.Long getPhone()
	{
		return getPhone(getContext());
	}

	/**
	 * @param context
	 * @return value of Phone
	 */
	public final java.lang.Long getPhone(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Long) getMendixObject().getValue(context, MemberNames.Phone.toString());
	}

	/**
	 * Set value of Phone
	 * @param phone
	 */
	public final void setPhone(java.lang.Long phone)
	{
		setPhone(getContext(), phone);
	}

	/**
	 * Set value of Phone
	 * @param context
	 * @param phone
	 */
	public final void setPhone(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Long phone)
	{
		getMendixObject().setValue(context, MemberNames.Phone.toString(), phone);
	}

	/**
	 * @return value of Email
	 */
	public final java.lang.String getEmail()
	{
		return getEmail(getContext());
	}

	/**
	 * @param context
	 * @return value of Email
	 */
	public final java.lang.String getEmail(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Email.toString());
	}

	/**
	 * Set value of Email
	 * @param email
	 */
	public final void setEmail(java.lang.String email)
	{
		setEmail(getContext(), email);
	}

	/**
	 * Set value of Email
	 * @param context
	 * @param email
	 */
	public final void setEmail(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String email)
	{
		getMendixObject().setValue(context, MemberNames.Email.toString(), email);
	}

	/**
	 * Set value of Sex
	 * @param sex
	 */
	public final myfirstmodule.proxies.Sex getSex()
	{
		return getSex(getContext());
	}

	/**
	 * @param context
	 * @return value of Sex
	 */
	public final myfirstmodule.proxies.Sex getSex(com.mendix.systemwideinterfaces.core.IContext context)
	{
		Object obj = getMendixObject().getValue(context, MemberNames.Sex.toString());
		if (obj == null)
			return null;

		return myfirstmodule.proxies.Sex.valueOf((java.lang.String) obj);
	}

	/**
	 * Set value of Sex
	 * @param sex
	 */
	public final void setSex(myfirstmodule.proxies.Sex sex)
	{
		setSex(getContext(), sex);
	}

	/**
	 * Set value of Sex
	 * @param context
	 * @param sex
	 */
	public final void setSex(com.mendix.systemwideinterfaces.core.IContext context, myfirstmodule.proxies.Sex sex)
	{
		if (sex != null)
			getMendixObject().setValue(context, MemberNames.Sex.toString(), sex.toString());
		else
			getMendixObject().setValue(context, MemberNames.Sex.toString(), null);
	}

	/**
	 * Set value of Work_Status
	 * @param work_status
	 */
	public final myfirstmodule.proxies.Work_Status getWork_Status()
	{
		return getWork_Status(getContext());
	}

	/**
	 * @param context
	 * @return value of Work_Status
	 */
	public final myfirstmodule.proxies.Work_Status getWork_Status(com.mendix.systemwideinterfaces.core.IContext context)
	{
		Object obj = getMendixObject().getValue(context, MemberNames.Work_Status.toString());
		if (obj == null)
			return null;

		return myfirstmodule.proxies.Work_Status.valueOf((java.lang.String) obj);
	}

	/**
	 * Set value of Work_Status
	 * @param work_status
	 */
	public final void setWork_Status(myfirstmodule.proxies.Work_Status work_status)
	{
		setWork_Status(getContext(), work_status);
	}

	/**
	 * Set value of Work_Status
	 * @param context
	 * @param work_status
	 */
	public final void setWork_Status(com.mendix.systemwideinterfaces.core.IContext context, myfirstmodule.proxies.Work_Status work_status)
	{
		if (work_status != null)
			getMendixObject().setValue(context, MemberNames.Work_Status.toString(), work_status.toString());
		else
			getMendixObject().setValue(context, MemberNames.Work_Status.toString(), null);
	}

	/**
	 * @return value of Devs_Stories
	 */
	public final java.util.List<myfirstmodule.proxies.Stories> getDevs_Stories() throws com.mendix.core.CoreException
	{
		return getDevs_Stories(getContext());
	}

	/**
	 * @param context
	 * @return value of Devs_Stories
	 */
	@SuppressWarnings("unchecked")
	public final java.util.List<myfirstmodule.proxies.Stories> getDevs_Stories(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		java.util.List<myfirstmodule.proxies.Stories> result = new java.util.ArrayList<myfirstmodule.proxies.Stories>();
		Object valueObject = getMendixObject().getValue(context, MemberNames.Devs_Stories.toString());
		if (valueObject == null)
			return result;
		for (com.mendix.systemwideinterfaces.core.IMendixObject mendixObject : com.mendix.core.Core.retrieveIdList(context, (java.util.List<com.mendix.systemwideinterfaces.core.IMendixIdentifier>) valueObject))
			result.add(myfirstmodule.proxies.Stories.initialize(context, mendixObject));
		return result;
	}

	/**
	 * Set value of Devs_Stories
	 * @param devs_stories
	 */
	public final void setDevs_Stories(java.util.List<myfirstmodule.proxies.Stories> devs_stories)
	{
		setDevs_Stories(getContext(), devs_stories);
	}

	/**
	 * Set value of Devs_Stories
	 * @param context
	 * @param devs_stories
	 */
	public final void setDevs_Stories(com.mendix.systemwideinterfaces.core.IContext context, java.util.List<myfirstmodule.proxies.Stories> devs_stories)
	{
		java.util.List<com.mendix.systemwideinterfaces.core.IMendixIdentifier> identifiers = new java.util.ArrayList<com.mendix.systemwideinterfaces.core.IMendixIdentifier>();
		for (myfirstmodule.proxies.Stories proxyObject : devs_stories)
			identifiers.add(proxyObject.getMendixObject().getId());
		getMendixObject().setValue(context, MemberNames.Devs_Stories.toString(), identifiers);
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return devsMendixObject;
	}

	/**
	 * @return the IContext instance of this proxy, or null if no IContext instance was specified at initialization.
	 */
	public final com.mendix.systemwideinterfaces.core.IContext getContext()
	{
		return context;
	}

	@java.lang.Override
	public boolean equals(Object obj)
	{
		if (obj == this)
			return true;

		if (obj != null && getClass().equals(obj.getClass()))
		{
			final myfirstmodule.proxies.Devs that = (myfirstmodule.proxies.Devs) obj;
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
		return "MyFirstModule.Devs";
	}

	/**
	 * @return String GUID from this object, format: ID_0000000000
	 * @deprecated Use getMendixObject().getId().toLong() to get a unique identifier for this object.
	 */
	@java.lang.Deprecated
	public java.lang.String getGUID()
	{
		return "ID_" + getMendixObject().getId().toLong();
	}
}

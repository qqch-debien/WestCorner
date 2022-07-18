import styles from "./navBar.module.css";
import { AuthLink } from "../links/authLink";

export const NavLinks = () => {
	return (
		<div className={styles.navLinksCountainer}>
			<AuthLink url="/posts/first-post">Connexion</AuthLink>
		</div>
	)
}

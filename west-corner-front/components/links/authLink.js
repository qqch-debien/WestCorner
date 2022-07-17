import styles from './authLink.module.css';
import Link from "next/link";

export const AuthLink = ({children}) => {
	return(
		<div>
			<Link href="/posts/first-post">
				<a className={styles.authLink}>{children}</a>
			</Link>
		</div>
	)
}
